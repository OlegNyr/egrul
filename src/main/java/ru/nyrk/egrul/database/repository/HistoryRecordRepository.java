package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.legal.HistoryRecord;

/**
 * Работа со справочником ОКВЭД
 */
public interface HistoryRecordRepository extends GraphRepository<HistoryRecord> {
}
