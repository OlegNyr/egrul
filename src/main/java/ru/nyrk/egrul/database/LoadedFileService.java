package ru.nyrk.egrul.database;

import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.prop.ServiceDatabase;

import java.util.Date;

public interface LoadedFileService extends ServiceDatabase<ArchiveFile> {
    ArchiveFile lastLoadedFileCorrect();

    ArchiveFile findLoadedFileByDateFileAndFileId(Date dateFile, Integer fileId);
}
