package ru.nyrk.database.entity.legal;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.XmlFile;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * Юридическое лицо
 */
@Data()
@NodeEntity
@Builder
public class LegalParty extends GRNDate {
    String inn;
    String ogrn;
    Date ogrnDate;

    Date beginDate;
    Date endDate;
    String endCode;
    String endName;

    String regNumber;
    String pensionFondRegNumber;
    Date pensionFondRegDate;

    String kpp;

    String okpfCode;
    String okpfDict;
    String okpfName;

    String fullName;
    String shortName;
    Address legalAddress;
    XmlFile xmlFile;


    List<EconomicActivity> economicActivitiesOther;

    EconomicActivity economicActivity;

    List<HistoryRecord> historyRecords;

    List<LegalAttorney> legalAttorneys;


    BigDecimal capital;
    List<OwnerCompany> ownerCompanys;

    public LegalParty() {
    }
}
