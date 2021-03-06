package ru.nyrk.egrul.loader.impl;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.LoadedFileError;
import ru.nyrk.egrul.database.entity.LoadedFileStatus;
import ru.nyrk.egrul.loader.*;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

/**
 * Шедуллер должен обновлять бд
 */
@Service
public class MappingProcessorImpl implements MappingProcessor {

    private static final Logger logger = LoggerFactory.getLogger(MappingProcessorImpl.class);

    private static final int ONE_DAY = 1;
    private static FastDateFormat fastDateFormat = FastDateFormat.getInstance("yyyyMMdd");
    @Autowired
    private LoaderFromNalog loaderFromNalog;
    @Autowired
    private ParseArchive parseArchive;

    @Override
    public void execute(CallbackSave callbackSave, ArchiveFileStoreService loadedFileService) throws ParseException, IOException {
        Date firstDateYear = fastDateFormat.parse("20170101");
        //Первым делом берем последниию загрузку
        ArchiveFile lastArchiveFile = loadedFileService.lastLoadedFileCorrect();
        //Высчитываем следующий файл
        ArchiveFile archiveFile = nextArchiveFileEntity(lastArchiveFile, firstDateYear, loadedFileService);
        while (true) {
            try {
                //Берем файлик если нет его то грузим с сервера
                File fileArchive = loaderFromNalog.load(archiveFile.getDateFile(),
                        TypeFile.EGRUL,
                        archiveFile.getDateFile().equals(firstDateYear),
                        archiveFile.getFileId());


                archiveFile.setStatus(LoadedFileStatus.LOADED);
                archiveFile.setFileName(fileArchive.getName());
                archiveFile = loadedFileService.createOrUpdate(archiveFile);


                //Парсим файл
                parseArchive.parseArchiveFile(fileArchive, archiveFile, callbackSave);
                archiveFile.setStatus(LoadedFileStatus.COMPLETE);
                archiveFile = loadedFileService.createOrUpdate(archiveFile);

                archiveFile = nextArchiveFileEntity(archiveFile, firstDateYear, loadedFileService);
                //Если дошли до последнего
                if (archiveFile.getDateFile().after(DateUtils.addDays(new Date(), -ONE_DAY))) {
                    break;
                }
            } catch (LoadException e) {
                logger.error("load error", e);
                if (e.getStatusCode() == 404) {
                    archiveFile = nextArchiveFileEntityAddDay(archiveFile);
                    continue;
                }
                addErrorLoadedFile(archiveFile, e);
                break;
            } catch (RuntimeException e) {
                logger.error("load error", e);
                addErrorLoadedFile(archiveFile, e);
                break;
            }
        }
        loadedFileService.createOrUpdate(archiveFile);
    }

    private ArchiveFile nextArchiveFileEntityAddDay(ArchiveFile archiveFile) {
        ArchiveFile archiveFileNew = new ArchiveFile();
        archiveFileNew.setDateFile(DateUtils.addDays(archiveFile.getDateFile(), ONE_DAY));
        archiveFileNew.setFileId(ONE_DAY);
        archiveFile = archiveFileNew;
        return archiveFile;
    }

    /**
     * Формирует сущьность описывающию следующий файл, если первого файла нет то формирует по дате firstDateYear
     */
    private ArchiveFile nextArchiveFileEntity(ArchiveFile lastArchiveFile, Date firstDateYear, ArchiveFileStoreService loadedFileService) {
        Date loadedDate;
        int index = 0;
        if (lastArchiveFile == null) {
            loadedDate = firstDateYear;
        } else {
            loadedDate = lastArchiveFile.getDateFile();
            index = lastArchiveFile.getFileId();
        }
        ArchiveFile archiveFile;


        //Берем следующий
        archiveFile = new ArchiveFile();
        archiveFile.setDateFile(loadedDate);
        archiveFile.setFileId(++index);
        archiveFile.setDateLoad(new Date());

        //если следующий есть, тогда возмем оригинал
        ArchiveFile archiveFileFind = loadedFileService.findLoadedFileByDateFileAndFileId(archiveFile.getDateFile(), archiveFile.getFileId());
        if (archiveFileFind != null) {
            archiveFile = archiveFileFind;
        }

        return archiveFile;
    }

    private void addErrorLoadedFile(ArchiveFile archiveFile, RuntimeException e) {
        if (archiveFile.getErrors() == null) {
            archiveFile.setErrors(Lists.newArrayList());
        }
        archiveFile.setStatus(LoadedFileStatus.ERROR);
        LoadedFileError loadedFileError = new LoadedFileError();
        loadedFileError.setDateError(new Date());
        loadedFileError.setMessage(ExceptionUtils.getMessage(e));
        loadedFileError.setStackTrace(ExceptionUtils.getStackTrace(e));
        archiveFile.getErrors().add(loadedFileError);
    }

}
