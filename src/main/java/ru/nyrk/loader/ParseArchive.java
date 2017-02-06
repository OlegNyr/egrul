package ru.nyrk.loader;

import ru.nyrk.database.entity.ArchiveFile;

import java.io.File;
import java.io.IOException;

/**
 * todo:java doc
 */
public interface ParseArchive {
    void parseArchiveFile(File file, ArchiveFile archiveFile) throws IOException;
}
