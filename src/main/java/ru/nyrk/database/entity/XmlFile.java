package ru.nyrk.database.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;

/**
 * Файл XML из архива
 */
@Data
@NodeEntity
@EqualsAndHashCode(exclude = {"archiveFile"})
public class XmlFile extends Entity {

    private String name;

    private String errorMessage;

    private Date date;

    private ArchiveFile archiveFile;

    private LoadedFileStatus status;
}
