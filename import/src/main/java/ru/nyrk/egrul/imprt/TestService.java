package ru.nyrk.egrul.imprt;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.LoadedFileError;
import ru.nyrk.egrul.database.entity.LoadedFileStatus;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.imprt.repo.ArchiveFileRepository;
import ru.nyrk.egrul.imprt.repo.XmlFileRepository;

import java.util.Date;

/**
 * todo:java doc
 */
@Service
public class TestService {
    @Autowired
    ArchiveFileRepository archiveFileRepository;
    @Autowired
    XmlFileRepository xmlFileRepository;

    @Transactional
    public void test() {
        ArchiveFile archiveFile = new ArchiveFile();
        archiveFile.setDateFile(new Date());
        archiveFile.setDateLoad(new Date());
        archiveFile.setFileId(111);
        archiveFile.setFileName("gdffds");
        archiveFile.setStatus(LoadedFileStatus.LOADED);
        LoadedFileError loadedFileError = new LoadedFileError();
        loadedFileError.setArchiveFile(archiveFile);

        archiveFile.setErrors(Lists.newArrayList(loadedFileError));
        XmlFile xmlFile = XmlFile
                .newBuilder()
                .withArchiveFile(archiveFile)
                .withDate(new Date())
                .withErrorMessage("text")
                .build();
        XmlFile save = xmlFileRepository.save(xmlFile);
        archiveFile.setXmlFiles(Lists.newArrayList(save));
        archiveFileRepository.save(archiveFile);
        System.out.println(archiveFileRepository.findOne(0L));
    }
}
