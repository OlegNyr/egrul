package ru.nyrk.database.service;

import ru.nyrk.database.entity.ArchiveFile;

import java.util.Date;

public interface LoadedFileService extends Service<ArchiveFile> {
    ArchiveFile lastLoadedFileCorrect();

    ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId);
}
