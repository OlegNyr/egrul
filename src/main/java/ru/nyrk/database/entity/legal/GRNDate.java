package ru.nyrk.database.entity.legal;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.typeconversion.DateLong;
import ru.nyrk.database.entity.Entity;

import java.util.Date;

/**
 * Дата записи и номер изменения
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GRNDate extends Entity {
    @DateLong
    private Date dateRecord;

    private String grn;

    public GRNDate() {
    }
}
