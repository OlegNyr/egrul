package ru.nyrk.database.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.database.entity.legal.EconomicActivity;

/**
 * Работа со справочником ОКВЭД
 */
public interface EconomicActivityRepository extends GraphRepository<EconomicActivity> {
    EconomicActivity findByCode(String code);
}
