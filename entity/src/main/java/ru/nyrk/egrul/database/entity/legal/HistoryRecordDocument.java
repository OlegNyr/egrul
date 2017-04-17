package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.DateLong;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import javax.persistence.*;
import java.util.Date;

@Data
@NodeEntity
@EqualsAndHashCode(callSuper = false)
@Entity
public class HistoryRecordDocument extends EntityAbstract {
    @DateLong
    Date dateDoc;
    String nameDoc;
    String numberDoc;
    HistoryRecord historyRecord;
    @Id
    public Long getId() {
        return id;
    }
    public HistoryRecordDocument() {
    }

    public HistoryRecordDocument(Date dateDoc, String nameDoc, String numberDoc) {
        this.dateDoc = dateDoc;
        this.nameDoc = nameDoc;
        this.numberDoc = numberDoc;
    }

    @ManyToOne
    public HistoryRecord getHistoryRecord() {
        return historyRecord;
    }
}
