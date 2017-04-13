package ru.nyrk.egrul.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.repository.LoadedFileRepository;
import ru.nyrk.egrul.loader.ArchiveFileStoreService;

import java.util.Date;

@Service
public class LoadedFileServiceImpl extends GenericService<ArchiveFile, LoadedFileRepository>
        implements LoadedFileService, ArchiveFileStoreService {

    @Autowired
    public LoadedFileServiceImpl(LoadedFileRepository loadedFileRepository) {
        super(loadedFileRepository);
    }

    @Override
    public ArchiveFile lastLoadedFileCorrect() {
        return repository.lastArchiveFileComplete();
    }

    @Override
    public ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId) {
        return repository.findByDateFileAndFileId(dateFile, fileId);
    }
}
