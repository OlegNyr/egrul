package ru.nyrk.egrul.loader;

import ru.nyrk.egrul.database.entity.ArchiveFile;

import java.util.Date;

public interface ArchiveFileStoreService {
    ArchiveFile lastLoadedFileCorrect();

    ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId);

    ArchiveFile createOrUpdate(ArchiveFile archiveFile);
}
