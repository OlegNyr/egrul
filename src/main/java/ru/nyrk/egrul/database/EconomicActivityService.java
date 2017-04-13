package ru.nyrk.egrul.database;

import ru.nyrk.egrul.database.entity.legal.EconomicActivity;
import ru.nyrk.egrul.prop.ServiceDatabase;

/**
 * Интерфейс работы с ОКВЭД
 */
public interface EconomicActivityService extends ServiceDatabase<EconomicActivity> {

    EconomicActivity findByCode(String kodOKVED);
}
