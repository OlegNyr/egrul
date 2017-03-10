package ru.nyrk.egrul.loader;

import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.generate.egrul.EGRUL;

/**
 * Загрузка XML в БД
 */
public interface EgrulService {
    void insertingBatch(EGRUL egrul, XmlFile xmlFile);
}
