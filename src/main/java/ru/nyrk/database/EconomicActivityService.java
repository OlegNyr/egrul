package ru.nyrk.database;

import ru.nyrk.database.entity.legal.EconomicActivity;

/**
 * Интерфейс работы с ОКВЭД
 */
public interface EconomicActivityService extends ServiceDatabase<EconomicActivity> {

    EconomicActivity findByCodeOrCreate(EconomicActivity economicActivity);
}
