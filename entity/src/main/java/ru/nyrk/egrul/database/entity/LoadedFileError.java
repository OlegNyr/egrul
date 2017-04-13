package ru.nyrk.egrul.database.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;

/**
 * Ошибки при загрузке данных
 */
@Data
@NodeEntity
@EqualsAndHashCode(callSuper = false)
public class LoadedFileError extends Entity {
    Date date;
    String message;
    String stackTrace;
}
