package ru.nyrk.egrul.loader;

import java.io.File;
import java.util.Date;

/**
 * Грузит файл с сервера и возращает ссылку на файл
 */
public interface LoaderFromNalog {
    File load(Date date, TypeFile typeFile, boolean isFull, Integer index);
}
