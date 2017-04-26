package ru.nyrk.egrul.imprt.repo;

import ru.nyrk.egrul.database.entity.legal.EconomicActivity;

/**
 * Работа со справочником ОКВЭД
 */
public interface EconomicActivityRepository extends LongCrudRepository<EconomicActivity> {
    EconomicActivity findByCode(String code);
}
