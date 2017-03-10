package ru.nyrk.egrul.loader;

import ru.nyrk.egrul.database.entity.ArchiveFile;

import java.io.File;
import java.io.IOException;

/**
 * todo:java doc
 */
public interface ParseArchive {
    void parseArchiveFile(File file, ArchiveFile archiveFile) throws IOException;
}
