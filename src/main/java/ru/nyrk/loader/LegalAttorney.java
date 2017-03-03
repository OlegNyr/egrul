package ru.nyrk.loader;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.Entity;

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
