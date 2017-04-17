package ru.nyrk.egrul.imprt.database;

import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.imprt.repo.ArchiveFileRepository;
import ru.nyrk.egrul.loader.ArchiveFileStoreService;

import java.util.Date;

/**
 * todo:java doc
 */
@Service
public class ArchiveFileServiceImpl extends GenericService<ArchiveFile, ArchiveFileRepository> implements ArchiveFileStoreService {

    public ArchiveFileServiceImpl(ArchiveFileRepository repository) {
        super(repository);
    }

    @Override
    public ArchiveFile lastLoadedFileCorrect() {
        return null;
    }

    @Override
    public ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId) {
        return null;
    }
}
