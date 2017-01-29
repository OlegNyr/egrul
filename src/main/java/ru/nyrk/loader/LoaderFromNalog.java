package ru.nyrk.loader;

import java.io.File;
import java.util.Date;

/**
 * todo:java doc
 */
public interface LoaderFromNalog {
    File load(Date date, TypeFile typeFile, boolean isFull, Integer index);
}
