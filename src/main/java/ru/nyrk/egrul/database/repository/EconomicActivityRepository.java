package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.legal.EconomicActivity;

/**
 * Работа со справочником ОКВЭД
 */
public interface EconomicActivityRepository extends GraphRepository<EconomicActivity> {
    @Depth(value = 0)
    EconomicActivity findByCode(String code);
}
