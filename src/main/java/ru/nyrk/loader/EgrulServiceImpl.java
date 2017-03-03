package ru.nyrk.loader;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.database.LegalPartyService;
import ru.nyrk.database.NaturalPersonService;
import ru.nyrk.database.entity.XmlFile;
import ru.nyrk.database.entity.legal.*;
import ru.nyrk.egrul.generate.egrul.*;

import java.util.List;

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

    @Override
    public void insertingBatch(EGRUL egrul, XmlFile xmlFile) {
        for (DocInfoULType d : egrul.getDocInfoUL()) {
            LegalParty.LegalPartyBuilder legalPartyBuilder =
                    LegalParty.builder()
                            .xmlFile(xmlFile)
                            .inn(d.getINN())
                            .kpp(d.getKPP())
                            .ogrn(d.getOGRN())
                            .okpfCode(d.getKodOPF())
                            .okpfDict(d.getSprOPF())
                            .okpfName(d.getFullNameOPF());
            addNameUl(d, legalPartyBuilder);
            if (d.getInfoAddressUl() != null) {
                legalPartyBuilder.legalAddress(addAddress(d.getInfoAddressUl().getAddressRF()));
            }

            LegalParty legalParty = legalPartyBuilder.build();
            if (d.getDocInfoRegisterUL() != null) {
                legalPartyBuilder.beginDate(
                        MoreObjects.firstNonNull(
                                d.getDocInfoRegisterUL().getДатаРег(),
                                d.getDocInfoRegisterUL().getДатаОГРН()
                        ));
                legalPartyBuilder.regNumber(d.getDocInfoRegisterUL().getРегНом());
            }
            if (d.getDocInfoRegisterPF() != null) {
                legalPartyBuilder.pensionFondRegNumber(d.getDocInfoRegisterPF().getРегНомПФ());
                legalPartyBuilder.pensionFondRegDate(d.getDocInfoRegisterPF().getДатаРег());
            }
            if (d.getDocInfoEndUL() != null) {
                legalPartyBuilder.endDate(d.getDocInfoEndUL().getДатаПрекрЮЛ());
                if (d.getDocInfoEndUL().getСпПрекрЮЛ() != null) {
                    legalPartyBuilder.endCode(d.getDocInfoEndUL().getСпПрекрЮЛ().getКодСпПрекрЮЛ());
                    legalPartyBuilder.endName(d.getDocInfoEndUL().getСпПрекрЮЛ().getНаимСпПрекрЮЛ());
                }
            }
            legalPartyBuilder.legalAttorneys(makeLegalAttorney(d.getDocInfoLicoDoveren()));

            setCapital(d, legalPartyBuilder);
            legalPartyBuilder.ownerCompanys(egrulOwnerServiceHelper.makeOwnerCompanys(d.getDocInfoUchered()));
            legalPartyBuilder.historyRecords(egrulHistoryServiceHelper.makeHistoryRecord(d.getDocInfoRecordEGRUL()));

            if (d.getInfoNameUl() != null) {
                legalParty.setDateRecord(d.getInfoNameUl().getGRNDate().getDateRecord());
                legalParty.setGrn(d.getInfoNameUl().getGRNDate().getGRN());
            }
        }
    }

    private void setCapital(DocInfoULType d, LegalParty.LegalPartyBuilder legalPartyBuilder) {
        if (d.getDocInfoUstavKapital() != null) {
            legalPartyBuilder.capital(d.getDocInfoUstavKapital().getСумКап());
        }
    }

    private List<LegalAttorney> makeLegalAttorney(List<DocInfoLicoDoverenType> docInfoLicoDoverenTypes) {
        List<LegalAttorney> legalAttorneys = Lists.newArrayList();
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
        Address.AddressBuilder addressBuilder = Address.builder()
                .pIndex(a.getIndex())
                .regionCode(a.getKodRegion())
                .kladr(a.getKodKLADR())
                .house(a.getHouse())
                .korpus(a.getKorpus())
                .kwartira(a.getKwart());
        if (a.getRegionType() != null) {
            addressBuilder.regionType(a.getRegionType().getRegionType());
            addressBuilder.regionName(a.getRegionType().getDistrictName());
        }
        if (a.getCityType() != null) {
            addressBuilder.cityType(a.getCityType().getCityType());
            addressBuilder.cityName(a.getCityType().getNameCity());
        }
        if (a.getDistrictType() != null) {
            addressBuilder.districtName(a.getDistrictType().getDistrictName());
            addressBuilder.districtType(a.getDistrictType().getDistrictType());
        }
        if (a.getStreetType() != null) {
            addressBuilder.streetName(a.getStreetType().getNameStreet());
            addressBuilder.streetType(a.getStreetType().getTypeStreet());
        }
        Address address = addressBuilder.build();
        if (a.getGRNType() != null) {
            address.setDateRecord(a.getGRNDateType().getDateRecord());
            address.setGrn(a.getGRNDateType().getGRN());
        }
        return address;
    }


    private void addNameUl(DocInfoULType docInfoULType, LegalParty.LegalPartyBuilder legalPartyBuilder) {
        if (docInfoULType.getInfoNameUl() == null) {
            logger.warn("not name for document ogrn({})", docInfoULType.getOGRN());
        }

        legalPartyBuilder
                .fullName(docInfoULType.getInfoNameUl().getNameUlFull())
                .shortName(docInfoULType.getInfoNameUl().getNameUlShort());

    }
}
