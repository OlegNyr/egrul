package ru.nyrk.database;

import ru.nyrk.database.entity.legal.NaturalPerson;

/**
 * Сервис управления физическими лицами
 */
public interface NaturalPersonService extends ServiceDatabase<NaturalPerson> {
    NaturalPerson findByInnOrCreate(NaturalPerson naturalPerson);
}
