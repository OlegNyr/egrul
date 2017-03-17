package ru.nyrk.egrul.loader;

import com.google.common.base.Preconditions;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.LoadedFileService;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.LoadedFileStatus;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.repository.XmlFileRepository;
import ru.nyrk.generate.egrul.DocInfoULType;
import ru.nyrk.generate.egrul.EGRUL;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * todo:java doc
 */

@Service
public class ParseArchiveImpl implements ParseArchive {
    public static final String EXTENSION_ZIP = "zip";
    private static final Logger logger = LoggerFactory.getLogger(ParseArchiveImpl.class);
    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private LoadedFileService loadedFileService;

    @Autowired
    private EgrulServiceAsync egrulServiceAsync;

    @Autowired
    private XmlFileRepository xmlFileRepository;

    @Override
    public void parseArchiveFile(File file, ArchiveFile archiveFile) throws IOException {
        Preconditions.checkArgument(FilenameUtils.isExtension(file.getName(), EXTENSION_ZIP));
        logger.info("Parse archive {}", file);

        ZipFile zipFile = new ZipFile(file);
        try {
            Enumeration<ZipArchiveEntry> entriesInPhysicalOrder = zipFile.getEntriesInPhysicalOrder();
            while (entriesInPhysicalOrder.hasMoreElements()) {
                ZipArchiveEntry zipArchiveEntry = entriesInPhysicalOrder.nextElement();
                logger.info("load xml from {}", zipArchiveEntry.getName());
                XmlFile xmlFile = null;
                try (InputStream entryStream = IOUtils.toBufferedInputStream(zipFile.getInputStream(zipArchiveEntry))) {
                    xmlFile = makeXmlFile(archiveFile, zipArchiveEntry);
                    if (xmlFile.getStatus() == LoadedFileStatus.COMPLETE) {
                        continue;
                    }
                    logger.info("Start parsing file {}" + xmlFile.getName());
                    EGRUL egrul = (EGRUL) jaxb2Marshaller.unmarshal(new StreamSource(entryStream));
                    logger.info("Finish parsing file");

                    importBatch(xmlFile, egrul);

                    xmlFile.setStatus(LoadedFileStatus.COMPLETE);
                } catch (RuntimeException th) {
                    logger.error("Insert", th);
                    xmlFile.setStatus(LoadedFileStatus.ERROR);
                    xmlFile.setErrorMessage(ExceptionUtils.getMessage(th));
                    loadedFileService.createOrUpdate(archiveFile);//запишем что там было в бд
                    throw new RuntimeException(th);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                loadedFileService.createOrUpdate(archiveFile);
            }
        } finally {
            zipFile.close();
        }
    }

    private void importBatch(XmlFile xmlFile, EGRUL egrul) throws InterruptedException, ExecutionException {
        logger.info("Start submit");
        List<Future<String>> futureList = new ArrayList<>(egrul.getDocInfoUL().size());
        for (DocInfoULType docInfoULType : egrul.getDocInfoUL()) {
            futureList.add(egrulServiceAsync.insertLegalPartyAsync(xmlFile, docInfoULType));
        }
        logger.info("end submit");

        System.out.print("Import doc:");
        int count = 0;
        for (Future<String> future : futureList) {
            if(count++ % 50 == 0 ){
                System.out.print("#");
            }
            if (!future.get().equals("OK")) throw new RuntimeException(future.get());
        }
        System.out.println(" end");
        logger.info("end future");
    }

    private XmlFile makeXmlFile(ArchiveFile archiveFile, ZipArchiveEntry zipArchiveEntry) {
        XmlFile xmlFile;
        Optional<XmlFile> first;
        first = archiveFile
                .getXmlFiles()
                .stream()
                .filter(a -> a.getName().equals(zipArchiveEntry.getName()))
                .findFirst();
        if (first.isPresent()) {
            xmlFile = first.get();
        } else {
            xmlFile = XmlFile.newBuilder()
                    .withName(zipArchiveEntry.getName())
                    .withArchiveFile(archiveFile)
                    .withDate(new Date())
                    .build();
            archiveFile.getXmlFiles().add(xmlFileRepository.save(xmlFile));

        }
        return xmlFile;
    }
}
