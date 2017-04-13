package ru.nyrk.egrul.loader;

import java.io.IOException;
import java.text.ParseException;

/**
 * todo:java doc
 */
public interface MappingProcessor {

    void execute(CallbackSave callbackSave, ArchiveFileStoreService loadedFileService) throws ParseException, IOException;
}
