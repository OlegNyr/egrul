package ru.nyrk.database;

import ru.nyrk.database.entity.ArchiveFile;

import java.util.Date;

public interface LoadedFileService extends ServiceDatabase<ArchiveFile> {
    ArchiveFile lastLoadedFileCorrect();

    ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId);
}
