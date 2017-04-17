package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Физическое лицо
 */
@Getter
@Setter
@NodeEntity
@Entity
public class NaturalPerson extends EntityAbstract {
    @Index(unique = true, primary = true)
    String key;
    String inn;
    String firstName;
    String middleName;
    String lastName;
    @Id
    public Long getId() {
        return id;
    }

    public NaturalPerson() {

    }

    private NaturalPerson(Builder builder) {
        setKey(builder.key);
        setInn(builder.inn);
        setFirstName(builder.firstName);
        setMiddleName(builder.middleName);
        setLastName(builder.lastName);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(NaturalPerson copy) {
        Builder builder = new Builder();
        builder.key = copy.key;
        builder.inn = copy.inn;
        builder.firstName = copy.firstName;
        builder.middleName = copy.middleName;
        builder.lastName = copy.lastName;
        return builder;
    }

    public static final class Builder {
        private String key;
        private String inn;
        private String firstName;
        private String middleName;
        private String lastName;

        private Builder() {
        }

        public Builder withKey(String val) {
            key = val;
            return this;
        }

        public Builder withInn(String val) {
            inn = val;
            return this;
        }

        public Builder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public Builder withMiddleName(String val) {
            middleName = val;
            return this;
        }

        public Builder withLastName(String val) {
            lastName = val;
            return this;
        }

        public NaturalPerson build() {
            return new NaturalPerson(this);
        }
    }
}
