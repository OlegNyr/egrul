package ru.nyrk.database.entity.legal;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

/**
 * История записи
 */
@NodeEntity
@Data
public class HistoryRecord extends GRNDate {
    private String vidRecord;
    private String nameRecord;
    private String haveRecord;
    private List<HistoryRecordDocument> historyRecordDocuments;
}
