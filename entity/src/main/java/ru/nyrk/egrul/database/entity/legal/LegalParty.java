package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import ru.nyrk.egrul.database.entity.XmlFile;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Юридическое лицо
 */
@Data()
@NodeEntity
@EqualsAndHashCode(callSuper = true, exclude = {"xmlFile", "previsionLegalHistory"})
@Entity
public class LegalParty extends GRNDate {
    @Index()
    private String inn;
    @Index(unique = true, primary = true)
    private String ogrn;
    private Date ogrnDate;

    private Date beginDate;
    private Date endDate;
    private String endCode;
    private String endName;

    private String regNumber;
    private String pensionFondRegNumber;
    private Date pensionFondRegDate;

    private String kpp;

    private String okpfCode;
    private String okpfDict;
    private String okpfName;

    private String fullName;
    private String shortName;
    private Address legalAddress;

    private XmlFile xmlFile;

    private Set<EconomicActivity> economicActivitiesOther;
    private EconomicActivity economicActivity;
    private Set<HistoryRecord> historyRecords;
    private Set<LegalAttorney> legalAttorneys;

    private BigDecimal capital;
    private Set<OwnerCompany> ownerCompanies;

    @Id
    public Long getId() {
        return id;
    }

    public LegalParty() {
    }

    @ManyToOne
    public Address getLegalAddress() {
        return legalAddress;
    }
    @ManyToOne
    public XmlFile getXmlFile() {
        return xmlFile;
    }

    @OneToMany
    public Set<EconomicActivity> getEconomicActivitiesOther() {
        return economicActivitiesOther;
    }

    @ManyToOne
    public EconomicActivity getEconomicActivity() {
        return economicActivity;
    }

    @OneToMany(mappedBy = "legalParty")
    public Set<HistoryRecord> getHistoryRecords() {
        return historyRecords;
    }
    @OneToMany(mappedBy = "legalParty")
    public Set<LegalAttorney> getLegalAttorneys() {
        return legalAttorneys;
    }
    @OneToMany(mappedBy = "legalParty")
    public Set<OwnerCompany> getOwnerCompanies() {
        return ownerCompanies;
    }

    private LegalParty(Builder builder) {
        setInn(builder.inn);
        setOgrn(builder.ogrn);
        setOgrnDate(builder.ogrnDate);
        setBeginDate(builder.beginDate);
        setEndDate(builder.endDate);
        setEndCode(builder.endCode);
        setEndName(builder.endName);
        setRegNumber(builder.regNumber);
        setPensionFondRegNumber(builder.pensionFondRegNumber);
        setPensionFondRegDate(builder.pensionFondRegDate);
        setKpp(builder.kpp);
        setOkpfCode(builder.okpfCode);
        setOkpfDict(builder.okpfDict);
        setOkpfName(builder.okpfName);
        setFullName(builder.fullName);
        setShortName(builder.shortName);
        setLegalAddress(builder.legalAddress);
        setXmlFile(builder.xmlFile);
        setEconomicActivitiesOther(builder.economicActivitiesOther);
        setEconomicActivity(builder.economicActivity);
        setHistoryRecords(builder.historyRecords);
        setLegalAttorneys(builder.legalAttorneys);
        setCapital(builder.capital);
        setOwnerCompanies(builder.ownerCompanies);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(LegalParty copy) {
        Builder builder = new Builder();
        builder.inn = copy.inn;
        builder.ogrn = copy.ogrn;
        builder.ogrnDate = copy.ogrnDate;
        builder.beginDate = copy.beginDate;
        builder.endDate = copy.endDate;
        builder.endCode = copy.endCode;
        builder.endName = copy.endName;
        builder.regNumber = copy.regNumber;
        builder.pensionFondRegNumber = copy.pensionFondRegNumber;
        builder.pensionFondRegDate = copy.pensionFondRegDate;
        builder.kpp = copy.kpp;
        builder.okpfCode = copy.okpfCode;
        builder.okpfDict = copy.okpfDict;
        builder.okpfName = copy.okpfName;
        builder.fullName = copy.fullName;
        builder.shortName = copy.shortName;
        builder.legalAddress = copy.legalAddress;
        builder.xmlFile = copy.xmlFile;
        builder.economicActivitiesOther = copy.economicActivitiesOther;
        builder.economicActivity = copy.economicActivity;
        builder.historyRecords = copy.historyRecords;
        builder.legalAttorneys = copy.legalAttorneys;
        builder.capital = copy.capital;
        builder.ownerCompanies = copy.ownerCompanies;
        return builder;
    }

    public static final class Builder {
        private String inn;
        private String ogrn;
        private Date ogrnDate;
        private Date beginDate;
        private Date endDate;
        private String endCode;
        private String endName;
        private String regNumber;
        private String pensionFondRegNumber;
        private Date pensionFondRegDate;
        private String kpp;
        private String okpfCode;
        private String okpfDict;
        private String okpfName;
        private String fullName;
        private String shortName;
        private Address legalAddress;
        private XmlFile xmlFile;
        private Set<EconomicActivity> economicActivitiesOther;
        private EconomicActivity economicActivity;
        private Set<HistoryRecord> historyRecords;
        private Set<LegalAttorney> legalAttorneys;
        private BigDecimal capital;
        private Set<OwnerCompany> ownerCompanies;

        private Builder() {
        }

        public Builder withInn(String val) {
            inn = val;
            return this;
        }

        public Builder withOgrn(String val) {
            ogrn = val;
            return this;
        }

        public Builder withOgrnDate(Date val) {
            ogrnDate = val;
            return this;
        }

        public Builder withBeginDate(Date val) {
            beginDate = val;
            return this;
        }

        public Builder withEndDate(Date val) {
            endDate = val;
            return this;
        }

        public Builder withEndCode(String val) {
            endCode = val;
            return this;
        }

        public Builder withEndName(String val) {
            endName = val;
            return this;
        }

        public Builder withRegNumber(String val) {
            regNumber = val;
            return this;
        }

        public Builder withPensionFondRegNumber(String val) {
            pensionFondRegNumber = val;
            return this;
        }

        public Builder withPensionFondRegDate(Date val) {
            pensionFondRegDate = val;
            return this;
        }

        public Builder withKpp(String val) {
            kpp = val;
            return this;
        }

        public Builder withOkpfCode(String val) {
            okpfCode = val;
            return this;
        }

        public Builder withOkpfDict(String val) {
            okpfDict = val;
            return this;
        }

        public Builder withOkpfName(String val) {
            okpfName = val;
            return this;
        }

        public Builder withFullName(String val) {
            fullName = val;
            return this;
        }

        public Builder withShortName(String val) {
            shortName = val;
            return this;
        }

        public Builder withLegalAddress(Address val) {
            legalAddress = val;
            return this;
        }

        public Builder withXmlFile(XmlFile val) {
            xmlFile = val;
            return this;
        }

        public Builder withEconomicActivitiesOther(Set<EconomicActivity> val) {
            economicActivitiesOther = val;
            return this;
        }

        public Builder withEconomicActivity(EconomicActivity val) {
            economicActivity = val;
            return this;
        }

        public Builder withHistoryRecords(Set<HistoryRecord> val) {
            historyRecords = val;
            return this;
        }

        public Builder withLegalAttorneys(Set<LegalAttorney> val) {
            legalAttorneys = val;
            return this;
        }

        public Builder withCapital(BigDecimal val) {
            capital = val;
            return this;
        }

        public Builder withOwnerCompanies(Set<OwnerCompany> val) {
            ownerCompanies = val;
            return this;
        }

        public LegalParty build() {
            return new LegalParty(this);
        }
    }
}
