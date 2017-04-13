package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.typeconversion.DateLong;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import java.util.Date;

/**
 * Дата записи и номер изменения
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GRNDate extends EntityAbstract {
    @DateLong
    private Date dateRecord;

    private String grn;

    public GRNDate() {
    }
}
