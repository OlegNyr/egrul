package ru.nyrk.loader;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import lombok.Cleanup;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.database.entity.ArchiveFile;
import ru.nyrk.database.entity.LoadedFileError;
import ru.nyrk.database.entity.LoadedFileStatus;
import ru.nyrk.database.entity.XmlFile;
import ru.nyrk.database.service.LoadedFileService;
import ru.nyrk.egrul.generate.egrul.EGRUL;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Optional;

/**
 * Шедуллер должен обновлять бд
 */
@Service
public class UpdateScheduler {

    private static final Logger logger = LoggerFactory.getLogger(UpdateScheduler.class);
    @Autowired
    private LoadedFileService loadedFileService;

    @Autowired
    private LoaderFromNalog loaderFromNalog;

    private static FastDateFormat fastDateFormat = FastDateFormat.getInstance("yyyyMMdd");

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

//    @Scheduled(fixedDelay = 1000 * 60 * 60 * 60)
    public void execute() throws ParseException, IOException {
        Date firstDateYear = fastDateFormat.parse("20170204");

        //Первым делом берем последниию загрузку
        ArchiveFile lastArchiveFile = null; loadedFileService.lastLoadedFileCorrect();
        Date loadedDate;
        int index = 0;
        if (lastArchiveFile == null) {
            loadedDate = firstDateYear;
        } else {
            loadedDate = lastArchiveFile.getDateFile();
            index = lastArchiveFile.getFileId();
        }
        //Берем следующий
        ArchiveFile archiveFile = new ArchiveFile();
        archiveFile.setDateFile(loadedDate);
        archiveFile.setFileId(++index);
        archiveFile.setDateLoad(new Date());

        //если следующий есть, тогда возмем оригинал
        ArchiveFile archiveFileFind = loadedFileService.findLoadedFileByDateFileAndFileId(archiveFile.getDateFile(), archiveFile.getFileId());
        if (archiveFileFind != null) {
            archiveFile = archiveFileFind;
        }

        //Читаем файл
        while (true) {
            try {
                File fileArchive = loaderFromNalog.load(archiveFile.getDateFile(),
                        TypeFile.EGRUL,
                        archiveFile.getDateFile().equals(firstDateYear),
                        archiveFile.getFileId());
                archiveFile.setStatus(LoadedFileStatus.LOADED);
                archiveFile.setFileName(fileArchive.getName());
                archiveFile = loadedFileService.createOrUpdate(archiveFile);

                parseArchiveFile(fileArchive, archiveFile);
                archiveFile.setStatus(LoadedFileStatus.COMPLETE);

                break;
            } catch (LoadException e) {
                logger.error("load error", e);
                if (e.getStatusCode() == 404) {
                    ArchiveFile archiveFileNew = new ArchiveFile();
                    archiveFileNew.setDateFile(DateUtils.addDays(archiveFile.getDateFile(), 1));
                    archiveFileNew.setFileId(1);
                    archiveFile = archiveFileNew;
                    continue;
                }
                addErrorLoadedFile(archiveFile, e);
            } catch (RuntimeException e) {
                logger.error("load error", e);
                addErrorLoadedFile(archiveFile, e);
            }
        }
        loadedFileService.createOrUpdate(archiveFile);
    }

    private void addErrorLoadedFile(ArchiveFile archiveFile, RuntimeException e) {
        if (archiveFile.getErrors() != null) {
            archiveFile.setErrors(Lists.newArrayList());
        }
        archiveFile.setStatus(LoadedFileStatus.ERROR);
        LoadedFileError loadedFileError = new LoadedFileError();
        loadedFileError.setDate(new Date());
        loadedFileError.setMessage(ExceptionUtils.getMessage(e));
        loadedFileError.setStackTrace(ExceptionUtils.getStackTrace(e));
        archiveFile.getErrors().add(loadedFileError);
    }

    private void parseArchiveFile(File file, ArchiveFile archiveFile) throws IOException {
        Preconditions.checkArgument(FilenameUtils.isExtension(file.getName(), "zip"));
        logger.info("Parse archive {}", file);

        ZipFile zipFile = new ZipFile(file);
        Enumeration<ZipArchiveEntry> entriesInPhysicalOrder = zipFile.getEntriesInPhysicalOrder();
        while (entriesInPhysicalOrder.hasMoreElements()) {
            ZipArchiveEntry zipArchiveEntry = entriesInPhysicalOrder.nextElement();
            logger.info("load xml from {}", zipArchiveEntry.getName());
            XmlFile xmlFile = null;
            try {
                Optional<XmlFile> first = archiveFile.getXmlFiles().stream().filter(a -> a.getName().equals(zipArchiveEntry.getName())).findFirst();
                if (first.isPresent()) {
                    xmlFile = first.get();
                } else {
                    xmlFile = new XmlFile();
                    xmlFile.setName(zipArchiveEntry.getName());
                    xmlFile.setArchiveFile(archiveFile);
                    xmlFile.setDate(new Date());
                    archiveFile.getXmlFiles().add(xmlFile);
                }
                @Cleanup InputStream entryStream = IOUtils.toBufferedInputStream(zipFile.getInputStream(zipArchiveEntry));
                EGRUL egrul = (EGRUL) jaxb2Marshaller.unmarshal(new StreamSource(entryStream));

                System.out.println(egrul);
            } catch (RuntimeException th) {
                xmlFile.setErrorMessage(ExceptionUtils.getMessage(th));
                loadedFileService.createOrUpdate(archiveFile);
                throw new RuntimeException(th);
            }
            loadedFileService.createOrUpdate(archiveFile);
        }
    }
}
