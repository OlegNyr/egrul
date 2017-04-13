package ru.nyrk.egrul.loader.impl;

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
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.LoadedFileStatus;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.loader.CallbackSave;
import ru.nyrk.egrul.loader.ParseArchive;
import ru.nyrk.generate.egrul.DocInfoULType;
import ru.nyrk.generate.egrul.EGRUL;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ExecutionException;

@Service
public class ParseArchiveImpl implements ParseArchive {
    public static final String EXTENSION_ZIP = "zip";
    private static final Logger logger = LoggerFactory.getLogger(ParseArchiveImpl.class);
    @Autowired
    EgrulMappingServiceImpl egrulMappingService;
    @Autowired
    private Jaxb2Marshaller jaxb2MarshallerEGRUL;

    @Override
    public void parseArchiveFile(File file, ArchiveFile archiveFile, CallbackSave callbackSave) {
        Preconditions.checkArgument(FilenameUtils.isExtension(file.getName(), EXTENSION_ZIP));
        logger.info("Parse archive {}", file);


        try (ZipFile zipFile = new ZipFile(file)) {
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
                    EGRUL egrul = (EGRUL) jaxb2MarshallerEGRUL.unmarshal(new StreamSource(entryStream));
                    logger.info("Finish parsing file");

                    callbackSave.call(archiveFile, xmlFile, mappingsEgrulToLegalParty(xmlFile, egrul));

                    xmlFile.setStatus(LoadedFileStatus.COMPLETE);
                } catch (RuntimeException th) {

                    logger.error("Insert", th);
                    xmlFile.setStatus(LoadedFileStatus.ERROR);
                    xmlFile.setErrorMessage(ExceptionUtils.getMessage(th));
                    callbackSave.call(archiveFile, xmlFile, Collections.emptyList());
                    throw new RuntimeException(th);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<LegalParty> mappingsEgrulToLegalParty(XmlFile xmlFile, EGRUL egrul) throws InterruptedException, ExecutionException {
        List<LegalParty> legalParties = new ArrayList<>(egrul.getDocInfoUL().size());
        for (DocInfoULType docInfoULType : egrul.getDocInfoUL()) {
            LegalParty legalParty = egrulMappingService.mappingLegalParty(docInfoULType);
            legalParty.setXmlFile(xmlFile);
            legalParties.add(legalParty);
        }
        return legalParties;
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
            archiveFile.getXmlFiles().add(xmlFile);

        }
        return xmlFile;
    }
}
