package ru.nyrk.egrul.database.entity.legal;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.typeconversion.DateLong;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import javax.persistence.Embeddable;
import java.util.Date;

/**
 * Дата записи и номер изменения
 */
@Getter
@Setter
@Embeddable
public class GRNDate extends EntityAbstract {
    @DateLong
    private Date dateRecord;

    private String grn;

    public GRNDate() {
    }
}
