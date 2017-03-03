package ru.nyrk.loader;

import ru.nyrk.database.entity.XmlFile;
import ru.nyrk.egrul.generate.egrul.EGRUL;

/**
 * Загрузка XML в БД
 */
public interface EgrulService {
    void insertingBatch(EGRUL egrul, XmlFile xmlFile);
}
