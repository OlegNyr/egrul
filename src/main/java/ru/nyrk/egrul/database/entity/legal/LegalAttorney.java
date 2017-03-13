package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.Entity;

/**
 * Доверенность
 */
@NodeEntity
public class LegalAttorney extends Entity {
    private NaturalPerson naturalPerson;
    private String dolgnostCode;
    private String dolgnostCodeName;
    private String dolgnostName;

    public NaturalPerson getNaturalPerson() {
        return naturalPerson;
    }

    public void setNaturalPerson(NaturalPerson naturalPerson) {
        this.naturalPerson = naturalPerson;
    }

    public String getDolgnostCode() {
        return dolgnostCode;
    }

    public void setDolgnostCode(String dolgnostCode) {
        this.dolgnostCode = dolgnostCode;
    }

    public String getDolgnostCodeName() {
        return dolgnostCodeName;
    }

    public void setDolgnostCodeName(String dolgnostCodeName) {
        this.dolgnostCodeName = dolgnostCodeName;
    }

    public String getDolgnostName() {
        return dolgnostName;
    }

    public void setDolgnostName(String dolgnostName) {
        this.dolgnostName = dolgnostName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LegalAttorney that = (LegalAttorney) o;

        if (getNaturalPerson() != null ? !getNaturalPerson().equals(that.getNaturalPerson()) : that.getNaturalPerson() != null)
            return false;
        if (getDolgnostCode() != null ? !getDolgnostCode().equals(that.getDolgnostCode()) : that.getDolgnostCode() != null)
            return false;
        if (getDolgnostCodeName() != null ? !getDolgnostCodeName().equals(that.getDolgnostCodeName()) : that.getDolgnostCodeName() != null)
            return false;
        return getDolgnostName() != null ? getDolgnostName().equals(that.getDolgnostName()) : that.getDolgnostName() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getNaturalPerson() != null ? getNaturalPerson().hashCode() : 0);
        result = 31 * result + (getDolgnostCode() != null ? getDolgnostCode().hashCode() : 0);
        result = 31 * result + (getDolgnostCodeName() != null ? getDolgnostCodeName().hashCode() : 0);
        result = 31 * result + (getDolgnostName() != null ? getDolgnostName().hashCode() : 0);
        return result;
    }
}
