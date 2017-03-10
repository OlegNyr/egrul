package ru.nyrk.egrul.database.entity;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import java.util.Date;
import java.util.List;

/**
 * Файл архива загруженный с сайта налоговой
 */
@NodeEntity
@Data
@EqualsAndHashCode(callSuper = true)
public class ArchiveFile extends Entity {
    @Index(unique = true)
    String fileName;
    Date dateLoad;
    @Index()
    @DateLong
    Date dateFile;
    Integer fileId;
    /**
     * Статус загрузки
     */
    LoadedFileStatus status;
    @Relationship(direction = Relationship.INCOMING, type = "LOADED_FILE_ERROR")
    List<LoadedFileError> errors;

    @Relationship(direction = Relationship.OUTGOING, type = "XML_FILE")
    List<XmlFile> xmlFiles;

    public List<XmlFile> getXmlFiles() {
        if (xmlFiles == null) {
            xmlFiles = Lists.newArrayList();
        }
        return xmlFiles;
    }
}
