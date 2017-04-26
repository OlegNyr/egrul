package ru.nyrk.egrul.imprt.database;

import org.springframework.cache.annotation.Cacheable;
import ru.nyrk.egrul.database.entity.legal.EconomicActivity;
import ru.nyrk.egrul.prop.ServiceDatabase;

import java.util.Set;

public interface EconomicActivityService extends ServiceDatabase<EconomicActivity> {
    @Cacheable(cacheNames = "EconomicActivity", unless = "#result == null")
    EconomicActivity findByCode(String code);

    void createOrFind(EconomicActivity economicActivity, Set<EconomicActivity> economicActivitiesOther);
}
