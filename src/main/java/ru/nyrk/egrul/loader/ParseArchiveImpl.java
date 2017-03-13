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
import java.util.Date;
import java.util.Enumeration;
import java.util.Optional;

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
    private EgrulService egrulService;

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
                    logger.info("Start insert legal count " + egrul.getDocInfoUL().size());
                    for (DocInfoULType docInfoUL : egrul.getDocInfoUL()) {
                        egrulService.insertLegalParty(xmlFile, docInfoUL);
                    }

                    xmlFile.setStatus(LoadedFileStatus.COMPLETE);
                } catch (RuntimeException th) {
                    logger.error("Insert", th);
                    xmlFile.setStatus(LoadedFileStatus.ERROR);
                    xmlFile.setErrorMessage(ExceptionUtils.getMessage(th));
                    loadedFileService.createOrUpdate(archiveFile);//запишем что там было в бд
                    throw new RuntimeException(th);
                }
                loadedFileService.createOrUpdate(archiveFile);
            }
        } finally {
            zipFile.close();
        }
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
