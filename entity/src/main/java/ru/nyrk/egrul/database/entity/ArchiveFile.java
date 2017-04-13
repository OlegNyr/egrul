package ru.nyrk.egrul.database.entity;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Файл архива загруженный с сайта налоговой
 */
@NodeEntity
@Data
@EqualsAndHashCode(callSuper = false)
@Entity()
public class ArchiveFile extends EntityAbstract {
    @Index(unique = true, primary = true)
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

    @Relationship(direction = Relationship.INCOMING, type = "XML_FILE")
    List<XmlFile> xmlFiles;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "archiveFile")
    public List<LoadedFileError> getErrors() {
        return errors;
    }

    @OneToMany(mappedBy = "archiveFile")
    public List<XmlFile> getXmlFiles() {
        if (xmlFiles == null) {
            xmlFiles = Lists.newArrayList();
        }
        return xmlFiles;
    }
}
