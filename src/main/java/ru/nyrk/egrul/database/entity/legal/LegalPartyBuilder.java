package ru.nyrk.egrul.database.entity.legal;

import ru.nyrk.egrul.database.entity.XmlFile;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * todo:java doc
 */
public final class LegalPartyBuilder {
    private Long id;
    private Date dateRecord;
    private String grn;
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
    private List<EconomicActivity> economicActivitiesOther;
    private EconomicActivity economicActivity;
    private List<HistoryRecord> historyRecords;
    private List<LegalAttorney> legalAttorneys;
    private BigDecimal capital;
    private List<OwnerCompany> ownerCompanies;

    private LegalPartyBuilder() {
    }

    public static LegalPartyBuilder aLegalParty() {
        return new LegalPartyBuilder();
    }

    public LegalPartyBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public LegalPartyBuilder withDateRecord(Date dateRecord) {
        this.dateRecord = dateRecord;
        return this;
    }

    public LegalPartyBuilder withGrn(String grn) {
        this.grn = grn;
        return this;
    }

    public LegalPartyBuilder withInn(String inn) {
        this.inn = inn;
        return this;
    }

    public LegalPartyBuilder withOgrn(String ogrn) {
        this.ogrn = ogrn;
        return this;
    }

    public LegalPartyBuilder withOgrnDate(Date ogrnDate) {
        this.ogrnDate = ogrnDate;
        return this;
    }

    public LegalPartyBuilder withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    public LegalPartyBuilder withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public LegalPartyBuilder withEndCode(String endCode) {
        this.endCode = endCode;
        return this;
    }

    public LegalPartyBuilder withEndName(String endName) {
        this.endName = endName;
        return this;
    }

    public LegalPartyBuilder withRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }

    public LegalPartyBuilder withPensionFondRegNumber(String pensionFondRegNumber) {
        this.pensionFondRegNumber = pensionFondRegNumber;
        return this;
    }

    public LegalPartyBuilder withPensionFondRegDate(Date pensionFondRegDate) {
        this.pensionFondRegDate = pensionFondRegDate;
        return this;
    }

    public LegalPartyBuilder withKpp(String kpp) {
        this.kpp = kpp;
        return this;
    }

    public LegalPartyBuilder withOkpfCode(String okpfCode) {
        this.okpfCode = okpfCode;
        return this;
    }

    public LegalPartyBuilder withOkpfDict(String okpfDict) {
        this.okpfDict = okpfDict;
        return this;
    }

    public LegalPartyBuilder withOkpfName(String okpfName) {
        this.okpfName = okpfName;
        return this;
    }

    public LegalPartyBuilder withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public LegalPartyBuilder withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public LegalPartyBuilder withLegalAddress(Address legalAddress) {
        this.legalAddress = legalAddress;
        return this;
    }

    public LegalPartyBuilder withXmlFile(XmlFile xmlFile) {
        this.xmlFile = xmlFile;
        return this;
    }

    public LegalPartyBuilder withEconomicActivitiesOther(List<EconomicActivity> economicActivitiesOther) {
        this.economicActivitiesOther = economicActivitiesOther;
        return this;
    }

    public LegalPartyBuilder withEconomicActivity(EconomicActivity economicActivity) {
        this.economicActivity = economicActivity;
        return this;
    }

    public LegalPartyBuilder withHistoryRecords(List<HistoryRecord> historyRecords) {
        this.historyRecords = historyRecords;
        return this;
    }

    public LegalPartyBuilder withLegalAttorneys(List<LegalAttorney> legalAttorneys) {
        this.legalAttorneys = legalAttorneys;
        return this;
    }

    public LegalPartyBuilder withCapital(BigDecimal capital) {
        this.capital = capital;
        return this;
    }

    public LegalPartyBuilder withOwnerCompanies(List<OwnerCompany> ownerCompanies) {
        this.ownerCompanies = ownerCompanies;
        return this;
    }

    public LegalParty build() {
        LegalParty legalParty = new LegalParty();
        legalParty.setId(id);
        legalParty.setDateRecord(dateRecord);
        legalParty.setGrn(grn);
        legalParty.setInn(inn);
        legalParty.setOgrn(ogrn);
        legalParty.setOgrnDate(ogrnDate);
        legalParty.setBeginDate(beginDate);
        legalParty.setEndDate(endDate);
        legalParty.setEndCode(endCode);
        legalParty.setEndName(endName);
        legalParty.setRegNumber(regNumber);
        legalParty.setPensionFondRegNumber(pensionFondRegNumber);
        legalParty.setPensionFondRegDate(pensionFondRegDate);
        legalParty.setKpp(kpp);
        legalParty.setOkpfCode(okpfCode);
        legalParty.setOkpfDict(okpfDict);
        legalParty.setOkpfName(okpfName);
        legalParty.setFullName(fullName);
        legalParty.setShortName(shortName);
        legalParty.setLegalAddress(legalAddress);
        legalParty.setXmlFile(xmlFile);
        legalParty.setEconomicActivitiesOther(economicActivitiesOther);
        legalParty.setEconomicActivity(economicActivity);
        legalParty.setHistoryRecords(historyRecords);
        legalParty.setLegalAttorneys(legalAttorneys);
        legalParty.setCapital(capital);
        legalParty.setOwnerCompanies(ownerCompanies);
        return legalParty;
    }
}
