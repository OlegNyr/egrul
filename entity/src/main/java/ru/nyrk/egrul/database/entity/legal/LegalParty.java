package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import ru.nyrk.egrul.database.entity.XmlFile;

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
//@EqualsAndHashCode(callSuper = true, exclude = {"xmlFile", "previsionLegalHistory"})
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

    public LegalParty() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LegalParty that = (LegalParty) o;

        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (ogrn != null ? !ogrn.equals(that.ogrn) : that.ogrn != null) return false;
        if (ogrnDate != null ? !ogrnDate.equals(that.ogrnDate) : that.ogrnDate != null) return false;
        if (beginDate != null ? !beginDate.equals(that.beginDate) : that.beginDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (endCode != null ? !endCode.equals(that.endCode) : that.endCode != null) return false;
        if (endName != null ? !endName.equals(that.endName) : that.endName != null) return false;
        if (regNumber != null ? !regNumber.equals(that.regNumber) : that.regNumber != null) return false;
        if (pensionFondRegNumber != null ? !pensionFondRegNumber.equals(that.pensionFondRegNumber) : that.pensionFondRegNumber != null)
            return false;
        if (pensionFondRegDate != null ? !pensionFondRegDate.equals(that.pensionFondRegDate) : that.pensionFondRegDate != null)
            return false;
        if (kpp != null ? !kpp.equals(that.kpp) : that.kpp != null) return false;
        if (okpfCode != null ? !okpfCode.equals(that.okpfCode) : that.okpfCode != null) return false;
        if (okpfDict != null ? !okpfDict.equals(that.okpfDict) : that.okpfDict != null) return false;
        if (okpfName != null ? !okpfName.equals(that.okpfName) : that.okpfName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (shortName != null ? !shortName.equals(that.shortName) : that.shortName != null) return false;
        if (legalAddress != null ? !legalAddress.equals(that.legalAddress) : that.legalAddress != null) return false;
        if (economicActivitiesOther != null ? !economicActivitiesOther.equals(that.economicActivitiesOther) : that.economicActivitiesOther != null)
            return false;
        if (economicActivity != null ? !economicActivity.equals(that.economicActivity) : that.economicActivity != null)
            return false;
        if (historyRecords != null ? !historyRecords.equals(that.historyRecords) : that.historyRecords != null)
            return false;
        if (legalAttorneys != null ? !legalAttorneys.equals(that.legalAttorneys) : that.legalAttorneys != null)
            return false;
        if (capital != null ? !capital.equals(that.capital) : that.capital != null) return false;
        return ownerCompanies != null ? ownerCompanies.equals(that.ownerCompanies) : that.ownerCompanies == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (ogrn != null ? ogrn.hashCode() : 0);
        result = 31 * result + (ogrnDate != null ? ogrnDate.hashCode() : 0);
        result = 31 * result + (beginDate != null ? beginDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (endCode != null ? endCode.hashCode() : 0);
        result = 31 * result + (endName != null ? endName.hashCode() : 0);
        result = 31 * result + (regNumber != null ? regNumber.hashCode() : 0);
        result = 31 * result + (pensionFondRegNumber != null ? pensionFondRegNumber.hashCode() : 0);
        result = 31 * result + (pensionFondRegDate != null ? pensionFondRegDate.hashCode() : 0);
        result = 31 * result + (kpp != null ? kpp.hashCode() : 0);
        result = 31 * result + (okpfCode != null ? okpfCode.hashCode() : 0);
        result = 31 * result + (okpfDict != null ? okpfDict.hashCode() : 0);
        result = 31 * result + (okpfName != null ? okpfName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (legalAddress != null ? legalAddress.hashCode() : 0);
        result = 31 * result + (economicActivitiesOther != null ? economicActivitiesOther.hashCode() : 0);
        result = 31 * result + (economicActivity != null ? economicActivity.hashCode() : 0);
        result = 31 * result + (historyRecords != null ? historyRecords.hashCode() : 0);
        result = 31 * result + (legalAttorneys != null ? legalAttorneys.hashCode() : 0);
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (ownerCompanies != null ? ownerCompanies.hashCode() : 0);
        return result;
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
