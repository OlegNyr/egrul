package ru.nyrk.database;

import ru.nyrk.loader.NaturalPerson;

/**
 * Сервис управления физическими лицами
 */
public interface NaturalPersonService extends ServiceDatabase<NaturalPerson> {
    NaturalPerson findByInnOrCreate(NaturalPerson naturalPerson);
}
