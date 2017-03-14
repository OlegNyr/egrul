package ru.nyrk.egrul.loader;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.EconomicActivityService;
import ru.nyrk.egrul.database.LegalPartyService;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.*;
import ru.nyrk.generate.egrul.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ПОлучает структуру
 */
@Service
public class EgrulServiceImpl implements EgrulService {
    private static final Logger logger = LoggerFactory.getLogger(EgrulServiceImpl.class);

    @Autowired
    private EgrulPersonServiceHelper egrulPersonServiceHelper;
    @Autowired
    private EgrulOwnerServiceHelper egrulOwnerServiceHelper;
    @Autowired
    private EgrulHistoryServiceHelper egrulHistoryServiceHelper;
    @Autowired
    private EconomicActivityService economicActivityService;
    @Autowired
    private LegalPartyService legalPartyService;

    @Override
    @Transactional
    public LegalParty insertLegalParty(XmlFile xmlFile, DocInfoULType docInfoUL) {
        logger.debug("Load legal party ogrn {}", docInfoUL.getOGRN());

        LegalParty.Builder legalPartyBuilder =
                LegalParty.newBuilder()
                        .withXmlFile(xmlFile)
                        .withInn(docInfoUL.getINN())
                        .withKpp(docInfoUL.getKPP())
                        .withOgrn(docInfoUL.getOGRN())
                        .withOkpfCode(docInfoUL.getKodOPF())
                        .withOkpfDict(docInfoUL.getSprOPF())
                        .withOkpfName(docInfoUL.getFullNameOPF());
        addNameUl(docInfoUL, legalPartyBuilder);
        if (docInfoUL.getInfoAddressUl() != null) {
            legalPartyBuilder.withLegalAddress(addAddress(docInfoUL.getInfoAddressUl().getAddressRF()));
        }

        if (docInfoUL.getDocInfoRegisterUL() != null) {
            legalPartyBuilder.withBeginDate(
                    MoreObjects.firstNonNull(
                            docInfoUL.getDocInfoRegisterUL().getДатаРег(),
                            docInfoUL.getDocInfoRegisterUL().getДатаОГРН()
                    ));
            legalPartyBuilder.withRegNumber(docInfoUL.getDocInfoRegisterUL().getРегНом());
        }
        if (docInfoUL.getDocInfoRegisterPF() != null) {
            legalPartyBuilder.withPensionFondRegNumber(docInfoUL.getDocInfoRegisterPF().getРегНомПФ());
            legalPartyBuilder.withPensionFondRegDate(docInfoUL.getDocInfoRegisterPF().getДатаРег());
        }
        if (docInfoUL.getDocInfoEndUL() != null) {
            legalPartyBuilder.withEndDate(docInfoUL.getDocInfoEndUL().getДатаПрекрЮЛ());
            if (docInfoUL.getDocInfoEndUL().getСпПрекрЮЛ() != null) {
                legalPartyBuilder.withEndCode(docInfoUL.getDocInfoEndUL().getСпПрекрЮЛ().getКодСпПрекрЮЛ());
                legalPartyBuilder.withEndName(docInfoUL.getDocInfoEndUL().getСпПрекрЮЛ().getНаимСпПрекрЮЛ());
            }
        }
        legalPartyBuilder.withLegalAttorneys(makeLegalAttorney(docInfoUL.getDocInfoLicoDoveren()));

        setCapital(docInfoUL, legalPartyBuilder);
        legalPartyBuilder.withOwnerCompanies(egrulOwnerServiceHelper.makeOwnerCompanys(docInfoUL.getDocInfoUchered()));


        legalPartyBuilder.withHistoryRecords(egrulHistoryServiceHelper.makeHistoryRecord(docInfoUL.getDocInfoRecordEGRUL()));
        if (docInfoUL.getDocInfoOKVED() != null) {
            legalPartyBuilder.withEconomicActivity(makeEconomicActivity(docInfoUL.getDocInfoOKVED().getСвОКВЭДОсн()));
            legalPartyBuilder.withEconomicActivitiesOther(makeEconomicActivityList(docInfoUL.getDocInfoOKVED()));
        }
        LegalParty legalParty = legalPartyBuilder.build();
        if (docInfoUL.getInfoNameUl() != null) {
            legalParty.setDateRecord(docInfoUL.getInfoNameUl().getGRNDate().getDateRecord());
            legalParty.setGrn(docInfoUL.getInfoNameUl().getGRNDate().getGRN());
        }
        logger.debug("create or replace ogrn {} entity {}", legalParty.getOgrn(), legalParty);

        return legalPartyService.findByOgrnOrCreate(legalParty);
    }

    private Set<EconomicActivity> makeEconomicActivityList(DocInfoOKVEDType docInfoOKVED) {
        Set<EconomicActivity> economicActivities = Sets.newHashSet();
        for (InfoOKVEDType infoOKVEDType : docInfoOKVED.getСвОКВЭДДоп()) {
            economicActivities.add(makeEconomicActivity(infoOKVEDType));
        }
        return economicActivities;
    }

    private EconomicActivity makeEconomicActivity(InfoOKVEDType infoOKVEDType) {
        if (infoOKVEDType != null) {
            EconomicActivity findActivity = economicActivityService.findByCode(infoOKVEDType.getKodOKVED());
            if(findActivity != null){
                return findActivity;
            }
            return economicActivityService.createOrUpdate(
                    new EconomicActivity(infoOKVEDType.getKodOKVED(), infoOKVEDType.getNameOKVED()));
        } else {
            return null;
        }
    }


    private void setCapital(DocInfoULType d, LegalParty.Builder legalPartyBuilder) {
        if (d.getDocInfoUstavKapital() != null) {
            legalPartyBuilder.withCapital(d.getDocInfoUstavKapital().getСумКап());
        }
    }

    private Set<LegalAttorney> makeLegalAttorney(List<DocInfoLicoDoverenType> docInfoLicoDoverenTypes) {
        Set<LegalAttorney> legalAttorneys = new HashSet<>();
        for (DocInfoLicoDoverenType docInfoLicoDoverenType : docInfoLicoDoverenTypes) {
            NaturalPerson naturalPerson = egrulPersonServiceHelper.makeNaturalPerson(docInfoLicoDoverenType.getСвФЛ());

            LegalAttorney legalAttorney = new LegalAttorney();
            legalAttorney.setNaturalPerson(naturalPerson);
            legalAttorney.setDolgnostCode(docInfoLicoDoverenType.getСвДолжн().getВидДолжн());
            legalAttorney.setDolgnostCodeName(docInfoLicoDoverenType.getСвДолжн().getНаимВидДолжн());
            legalAttorney.setDolgnostName(docInfoLicoDoverenType.getСвДолжн().getНаимДолжн());
            legalAttorneys.add(legalAttorney);
        }
        return legalAttorneys;
    }

    private Address addAddress(AddressRFEGRULType a) {
        Address.Builder addressBuilder = Address.newBuilder()
                .withPIndex(a.getIndex())
                .withRegionCode(a.getKodRegion())
                .withKladr(a.getKodKLADR())
                .withHouse(a.getHouse())
                .withKorpus(a.getKorpus())
                .withKwartira(a.getKwart());
        if (a.getRegionType() != null) {
            addressBuilder.withRegionType(a.getRegionType().getRegionType());
            addressBuilder.withRegionName(a.getRegionType().getDistrictName());
        }
        if (a.getCityType() != null) {
            addressBuilder.withCityType(a.getCityType().getCityType());
            addressBuilder.withCityName(a.getCityType().getNameCity());
        }
        if (a.getDistrictType() != null) {
            addressBuilder.withDistrictName(a.getDistrictType().getDistrictName());
            addressBuilder.withDistrictType(a.getDistrictType().getDistrictType());
        }
        if (a.getStreetType() != null) {
            addressBuilder.withStreetName(a.getStreetType().getNameStreet());
            addressBuilder.withStreetType(a.getStreetType().getTypeStreet());
        }

        Address address = addressBuilder.build();
        if (a.getGRNType() != null) {
            address.setDateRecord(a.getGRNType().getDateRecord());
            address.setGrn(a.getGRNType().getGRN());
        }
        return addressBuilder.build();
    }


    private void addNameUl(DocInfoULType docInfoULType, LegalParty.Builder legalPartyBuilder) {
        if (docInfoULType.getInfoNameUl() == null) {
            logger.warn("not name for document ogrn({})", docInfoULType.getOGRN());
        }

        legalPartyBuilder
                .withFullName(docInfoULType.getInfoNameUl().getNameUlFull())
                .withShortName(docInfoULType.getInfoNameUl().getNameUlShort());

    }
}
