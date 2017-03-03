package ru.nyrk.loader;

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
import ru.nyrk.database.entity.ArchiveFile;
import ru.nyrk.database.entity.LoadedFileStatus;
import ru.nyrk.database.entity.XmlFile;
import ru.nyrk.database.LoadedFileService;
import ru.nyrk.egrul.generate.egrul.EGRUL;

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
    private static final Logger logger = LoggerFactory.getLogger(ParseArchiveImpl.class);
    public static final String EXTENSION_ZIP = "zip";

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private LoadedFileService loadedFileService;

    @Autowired
    private EgrulService egrulService;

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
                    EGRUL egrul = (EGRUL) jaxb2Marshaller.unmarshal(new StreamSource(entryStream));
                    egrulService.insertingBatch(egrul, xmlFile);
                    xmlFile.setStatus(LoadedFileStatus.COMPLETE);
                } catch (RuntimeException th) {
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
        return xmlFile;
    }
}
