package ru.nyrk.database.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;

@NodeEntity
@Data
public class LoadedFile extends Entity {
    @Index(unique = true)
    String fileName;
    Date dateLoad;
    @Index()
    Date dateFile;
    Integer fileId;
}
