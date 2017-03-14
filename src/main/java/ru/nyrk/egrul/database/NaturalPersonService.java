package ru.nyrk.egrul.database;

import ru.nyrk.egrul.database.entity.legal.NaturalPerson;

/**
 * Сервис управления физическими лицами
 */
public interface NaturalPersonService extends ServiceDatabase<NaturalPerson> {
    NaturalPerson findByKey(String key);
}
