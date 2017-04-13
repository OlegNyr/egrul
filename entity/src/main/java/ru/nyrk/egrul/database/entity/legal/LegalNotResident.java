package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.DateLong;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import java.util.Date;

@Data
@NodeEntity
@EqualsAndHashCode(callSuper = false)
public class LegalNotResident extends EntityAbstract {
    private String fullName;
    private String OKSM;
    private String country;
    @DateLong
    private Date regDate;
    private String regNumb;
    private String regName;
    private String address;

    public LegalNotResident() {
    }

    public static final class LegalNotResidentBuilder {
        private String fullName;
        private String OKSM;
        private String country;
        private Date regDate;
        private String regNumb;
        private String regName;
        private String address;

        private LegalNotResidentBuilder() {
        }

        public static LegalNotResidentBuilder aLegalNotResident() {
            return new LegalNotResidentBuilder();
        }

        public LegalNotResidentBuilder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public LegalNotResidentBuilder withOKSM(String OKSM) {
            this.OKSM = OKSM;
            return this;
        }

        public LegalNotResidentBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public LegalNotResidentBuilder withRegDate(Date regDate) {
            this.regDate = regDate;
            return this;
        }

        public LegalNotResidentBuilder withRegNumb(String regNumb) {
            this.regNumb = regNumb;
            return this;
        }

        public LegalNotResidentBuilder withRegName(String regName) {
            this.regName = regName;
            return this;
        }

        public LegalNotResidentBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public LegalNotResident build() {
            LegalNotResident legalNotResident = new LegalNotResident();
            legalNotResident.setFullName(fullName);
            legalNotResident.setOKSM(OKSM);
            legalNotResident.setCountry(country);
            legalNotResident.setRegDate(regDate);
            legalNotResident.setRegNumb(regNumb);
            legalNotResident.setRegName(regName);
            legalNotResident.setAddress(address);
            return legalNotResident;
        }
    }
}
