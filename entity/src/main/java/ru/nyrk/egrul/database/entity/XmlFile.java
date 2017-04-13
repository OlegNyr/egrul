package ru.nyrk.egrul.database.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Файл XML из архива
 */
@Data
@NodeEntity
@EqualsAndHashCode(exclude = {"archiveFile"}, callSuper = false)
@Entity()
public class XmlFile extends EntityAbstract {

    private String name;

    private String errorMessage;

    private Date dateFile;

    private ArchiveFile archiveFile;

    private LoadedFileStatus status;

    public XmlFile() {

    }

    private XmlFile(Builder builder) {
        setName(builder.name);
        setErrorMessage(builder.errorMessage);
        setDateFile(builder.date);
        setArchiveFile(builder.archiveFile);
        setStatus(builder.status);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(XmlFile copy) {
        Builder builder = new Builder();
        builder.name = copy.name;
        builder.errorMessage = copy.errorMessage;
        builder.date = copy.dateFile;
        builder.archiveFile = copy.archiveFile;
        builder.status = copy.status;
        return builder;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    @ManyToOne
    public ArchiveFile getArchiveFile() {
        return archiveFile;
    }

    public static final class Builder {
        private String name;
        private String errorMessage;
        private Date date;
        private ArchiveFile archiveFile;
        private LoadedFileStatus status;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withErrorMessage(String val) {
            errorMessage = val;
            return this;
        }

        public Builder withDate(Date val) {
            date = val;
            return this;
        }

        public Builder withArchiveFile(ArchiveFile val) {
            archiveFile = val;
            return this;
        }

        public Builder withStatus(LoadedFileStatus val) {
            status = val;
            return this;
        }

        public XmlFile build() {
            return new XmlFile(this);
        }
    }
}
