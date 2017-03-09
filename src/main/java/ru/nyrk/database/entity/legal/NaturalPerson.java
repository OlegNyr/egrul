package ru.nyrk.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.Entity;

/**
 * Физическое лицо
 */
@Data
@NodeEntity
@EqualsAndHashCode(callSuper = true)
public class NaturalPerson extends Entity {
    @Index(unique = true)
    String inn;
    String firstName;
    String middleName;
    String lastName;


}
