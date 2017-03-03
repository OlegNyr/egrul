package ru.nyrk.database.entity.legal;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * История записи
 */
@NodeEntity
@Data
public class HistoryRecord extends GRNDate {
  String vidRecord;
  String nameRecord;
  String haveRecord;
}
