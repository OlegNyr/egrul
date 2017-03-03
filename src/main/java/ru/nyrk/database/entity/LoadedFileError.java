package ru.nyrk.database.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;

/**
 * Ошибки при загрузке данных
 */
@Data
@NodeEntity
public class LoadedFileError extends Entity {
    Date date;
    String message;
    String stackTrace;
}
