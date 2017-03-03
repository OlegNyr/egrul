package ru.nyrk.loader;

import lombok.Data;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.Entity;

/**
 * Физическое лицо
 */
@Data
@NodeEntity
public class NaturalPerson extends Entity {
    @Index(unique = true)
    String inn;
    String firstName;
    String middleName;
    String lastName;


}
