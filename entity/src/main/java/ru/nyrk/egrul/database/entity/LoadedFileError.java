package ru.nyrk.egrul.database.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Ошибки при загрузке данных
 */
@Data
@NodeEntity
@EqualsAndHashCode(callSuper = false)
@Entity
public class LoadedFileError extends EntityAbstract {
    Date dateError;
    String message;
    String stackTrace;

    ArchiveFile archiveFile;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    @ManyToOne
    public ArchiveFile getArchiveFile() {
        return archiveFile;
    }

}
