package ru.nyrk.egrul.database;

import org.springframework.beans.factory.annotation.Autowired;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.repository.LoadedFileRepository;

import java.util.Date;

@org.springframework.stereotype.Service
public class LoadedFileServiceImpl extends GenericService<ArchiveFile> implements LoadedFileService {

    @Autowired
    public LoadedFileServiceImpl(LoadedFileRepository loadedFileRepository) {
        super(loadedFileRepository);
    }

    @Override
    protected LoadedFileRepository getGraphRepository() {
        return (LoadedFileRepository) super.getGraphRepository();
    }

    @Override
    public ArchiveFile lastLoadedFileCorrect() {
        return getGraphRepository().lastArchiveFileComplete();
    }

    @Override
    public ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId) {
        return getGraphRepository().findByDateFileAndFileId(dateFile, fileId);
    }
}
