package ru.nyrk.egrul.loader;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.LegalPartyService;
import ru.nyrk.egrul.database.entity.legal.LegalNotResident;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.database.entity.legal.OwnerCompany;
import ru.nyrk.generate.egrul.*;

import java.util.List;
import java.util.Set;

/**
 * GJvjoybr ghb
 */
@Service
public class EgrulOwnerServiceHelper {

    private static final Logger logger = LoggerFactory.getLogger(EgrulOwnerServiceHelper.class);
    @Autowired
    private EgrulPersonServiceHelper egrulPersonServiceHelper;

    @Autowired
    private LegalPartyService legalPartyService;

    public Set<OwnerCompany> makeOwnerCompanys(DocInfoUcheredType docInfoUchered) {
        if (docInfoUchered == null) return null;
        Set<OwnerCompany> companyList = Sets.newHashSet();
        for (DocInfoUcheredFLType ucheredFLType : docInfoUchered.getУчрФЛ()) {
            OwnerCompany ownerCompany = new OwnerCompany();
            ownerCompany.setNaturalPerson(egrulPersonServiceHelper.makeNaturalPerson(ucheredFLType.getСвФЛ()));
            ownerCompany.setProportion(makeProportion(ucheredFLType.getДоляУстКап()));
            companyList.add(ownerCompany);
        }
        for (DocInfoUcheredULRFType ulrfType : docInfoUchered.getУчрЮЛРос()) {
            OwnerCompany ownerCompany = new OwnerCompany();
            ownerCompany.setLegalParty(makeLegalParty(ulrfType.getНаимИННЮЛ()));
            ownerCompany.setProportion(makeProportion(ulrfType.getДоляУстКап()));
            companyList.add(ownerCompany);
        }
        for (DocInfoUcheredULInostrType ulInostrType : docInfoUchered.getУчрЮЛИн()) {
            OwnerCompany ownerCompany = new OwnerCompany();
            ownerCompany.setLegalPartyNotResident(makeLegalPartyNotResident(ulInostrType.getНаимИННЮЛ(), ulInostrType.getСвРегИн()));
            ownerCompany.setProportion(makeProportion(ulInostrType.getДоляУстКап()));
            companyList.add(ownerCompany);
        }

        return companyList;
    }

    private LegalNotResident makeLegalPartyNotResident(InfoULEGRULType infoULEGRULType, InfoRegInstrEGRULULType reg) {
        return LegalNotResident.LegalNotResidentBuilder.aLegalNotResident()
                .withFullName(infoULEGRULType.getNameUlFull())
                .withOKSM(reg.getOKSM().getValue())
                .withCountry(reg.getNameContry())
                .withRegDate(reg.getDateReg())
                .withRegNumb(reg.getNumberReg())
                .withRegName(reg.getNameRegOrgan())
                .withAddress(reg.getAddress())
                .build();
    }

    private LegalParty makeLegalParty(InfoULEGRULType infoULEGRULType) {
        String ogrn = infoULEGRULType.getOGRN() != null ? infoULEGRULType.getOGRN() : DigestUtils.sha256Hex(infoULEGRULType.getNameUlFull());
        LegalParty byOgrn = legalPartyService.findByOgrn(ogrn,1);
        if (byOgrn != null) {
            return byOgrn;
        }

        return legalPartyService.createOrUpdate(
                LegalParty.newBuilder()
                        .withOgrn(ogrn)
                        .withFullName(infoULEGRULType.getNameUlFull())
                        .withShortName(infoULEGRULType.getNameUlFull())
                        .withInn(infoULEGRULType.getInn())
                        .build()
        );
    }

    private String makeProportion(ShareCapitalEGRULType shareCapitalEGRULType) {
        if (shareCapitalEGRULType == null) return null;

        ShareSize shareSize = shareCapitalEGRULType.getShareSize();
        if (shareSize != null) {
            DrobType drobProst = shareSize.getDrobProst();
            if (drobProst != null) {
                return String.format("%d/%d", drobProst.getChislit(), drobProst.getZnamenatel());
            } else {
                return String.format("%f%%", shareSize.getProcent()) + "%";
            }
        } else {
            return shareCapitalEGRULType.getNominalValue().toString();
        }
    }
}
