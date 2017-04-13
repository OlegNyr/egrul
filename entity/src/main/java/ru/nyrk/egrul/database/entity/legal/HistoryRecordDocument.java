package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.DateLong;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import java.util.Date;

/**
 * todo:java doc
 */
@Data
@NodeEntity
@EqualsAndHashCode(callSuper = false)
public class HistoryRecordDocument extends EntityAbstract {
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
