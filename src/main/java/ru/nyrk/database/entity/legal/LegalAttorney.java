package ru.nyrk.database.entity.legal;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.Entity;
import ru.nyrk.database.entity.legal.NaturalPerson;

/**
 * Доверенность
 */
@NodeEntity
@Data
public class LegalAttorney extends Entity {
    NaturalPerson naturalPerson;
    String dolgnostCode;
    String dolgnostCodeName;
    String dolgnostName;
}
