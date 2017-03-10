package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

/**
 * История записи
 */
@NodeEntity
@Data
@EqualsAndHashCode(callSuper = true)
public class HistoryRecord extends GRNDate {
    private String vidRecord;
    private String nameRecord;
    private String haveRecord;
    private List<HistoryRecordDocument> historyRecordDocuments;
}
