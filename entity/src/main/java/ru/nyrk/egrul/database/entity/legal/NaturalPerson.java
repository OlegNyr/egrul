package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.Entity;

/**
 * Физическое лицо
 */
@Data
@NodeEntity
//@EqualsAndHashCode(callSuper = false)
public class NaturalPerson extends Entity {
    @Index(unique = true, primary = true)
    String key;
    String inn;
    String firstName;
    String middleName;
    String lastName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NaturalPerson)) return false;

        NaturalPerson that = (NaturalPerson) o;

        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
