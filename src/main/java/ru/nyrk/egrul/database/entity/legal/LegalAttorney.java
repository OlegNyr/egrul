package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.Entity;

/**
 * Доверенность
 */
@NodeEntity
@Data
@EqualsAndHashCode(callSuper = true)
public class LegalAttorney extends Entity {
    NaturalPerson naturalPerson;
    String dolgnostCode;
    String dolgnostCodeName;
    String dolgnostName;
}
