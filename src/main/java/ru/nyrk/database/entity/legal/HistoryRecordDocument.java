package ru.nyrk.database.entity.legal;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import java.util.Date;

/**
 * todo:java doc
 */
@Data
@NodeEntity
public class HistoryRecordDocument {
    @DateLong
    Date dateDoc;
    String nameDoc;
    String numberDoc;

    public HistoryRecordDocument() {
    }

    public HistoryRecordDocument(Date dateDoc, String nameDoc, String numberDoc) {
        this.dateDoc = dateDoc;
        this.nameDoc = nameDoc;
        this.numberDoc = numberDoc;
    }
}
