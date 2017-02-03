package ru.nyrk.database.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.GraphId;

@Data
@EqualsAndHashCode(exclude = "id")
public abstract class Entity {

    @GraphId
    private Long id;
}
