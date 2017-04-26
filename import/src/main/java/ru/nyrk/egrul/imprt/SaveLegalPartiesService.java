package ru.nyrk.egrul.imprt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.imprt.database.EconomicActivityService;
import ru.nyrk.egrul.imprt.database.EconomicActivityServiceImpl;
import ru.nyrk.egrul.imprt.database.LegalPartyService;
import ru.nyrk.egrul.imprt.database.XmlFileService;
import ru.nyrk.egrul.loader.CallbackSave;

import java.util.List;

@Service
public class SaveLegalPartiesService implements CallbackSave {

    @Autowired
    private EconomicActivityService economicActivityService;

    @Autowired
    private LegalPartyService legalPartyService;

    @Autowired
    private XmlFileService xmlFileService;

    @Transactional
    @Override
    public void call(ArchiveFile archiveFile, XmlFile xmlFile, List<LegalParty> legalParties) {
        xmlFileService.createOrUpdate(xmlFile);

        for (LegalParty legalParty : legalParties) {
            economicActivityService.createOrFind(legalParty.getEconomicActivity(), legalParty.getEconomicActivitiesOther());
        }


        for (LegalParty legalParty : legalParties) {
            legalParty.setXmlFile(xmlFile);
            legalPartyService.saveGraph(legalParty);
        }
    }
}
