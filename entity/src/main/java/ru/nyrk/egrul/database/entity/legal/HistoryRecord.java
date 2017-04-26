package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.NodeEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * История записи
 */
@NodeEntity
@Entity
@Getter
@Setter
public class HistoryRecord extends GRNDate {
    private String vidRecord;
    private String nameRecord;
    private String haveRecord;
    private LegalParty legalParty;
    private Set<HistoryRecordDocument> historyRecordDocuments;
    @Id
    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "historyRecord")
    public Set<HistoryRecordDocument> getHistoryRecordDocuments() {
        return historyRecordDocuments;
    }

    @ManyToOne
    public LegalParty getLegalParty() {
        return legalParty;
    }
}
