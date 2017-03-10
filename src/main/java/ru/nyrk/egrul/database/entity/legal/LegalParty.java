package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.XmlFile;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * Юридическое лицо
 */
@Data()
@NodeEntity
@EqualsAndHashCode(callSuper = true)
public class LegalParty extends GRNDate {
    @Index(unique = true, primary = true)
    private String inn;
    @Index(unique = true)
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

    public LegalParty() {
    }

}