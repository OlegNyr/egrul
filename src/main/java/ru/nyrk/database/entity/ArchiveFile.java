package ru.nyrk.database.entity;

import com.google.common.collect.Lists;
import lombok.Data;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import java.util.Date;
import java.util.List;

@NodeEntity
@Data
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
