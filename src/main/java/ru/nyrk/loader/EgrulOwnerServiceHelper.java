package ru.nyrk.loader;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.database.LegalPartyService;
import ru.nyrk.database.LegalPartyServiceImpl;
import ru.nyrk.database.entity.legal.LegalNotResident;
import ru.nyrk.database.entity.legal.LegalParty;
import ru.nyrk.database.entity.legal.OwnerCompany;
import ru.nyrk.egrul.generate.egrul.*;

import java.util.List;

/**
 * GJvjoybr ghb
 */
@Service
public class EgrulOwnerServiceHelper {

    @Autowired
    private EgrulPersonServiceHelper egrulPersonServiceHelper;

    @Autowired
    private LegalPartyService legalPartyService;

    public List<OwnerCompany> makeOwnerCompanys(DocInfoUcheredType docInfoUchered) {
        List<OwnerCompany> companyList = Lists.newArrayList();
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
        return LegalNotResident.builder()
                .fullName(infoULEGRULType.getNameUlFull())
                .OKSM(reg.getOKSM().getValue())
                .country(reg.getNameContry())
                .regDate(reg.getDateReg())
                .regNumb(reg.getNumberReg())
                .regName(reg.getNameRegOrgan())
                .address(reg.getAddress())
                .build();
    }

    private LegalParty makeLegalParty(InfoULEGRULType infoULEGRULType) {
        return legalPartyService.findByOgrnOrCreate(
                LegalParty.builder()
                        .ogrn(infoULEGRULType.getOGRN())
                        .fullName(infoULEGRULType.getNameUlFull())
                        .inn(infoULEGRULType.getInn())
                        .build()
        );
    }

    private String makeProportion(ShareCapitalEGRULType shareCapitalEGRULType) {
        ShareSize shareSize = shareCapitalEGRULType.getShareSize();
        if (shareSize != null) {
            DrobType drobProst = shareSize.getDrobProst();
            if (drobProst != null) {
                return String.format(" %d / %d", drobProst.getChislit(), drobProst.getZnamenatel());
            } else {
                return String.format(" %d %", shareSize.getProcent());
            }
        } else {
            return shareCapitalEGRULType.getNominalValue().toString();
        }
    }
}