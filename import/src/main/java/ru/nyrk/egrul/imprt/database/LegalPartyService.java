package ru.nyrk.egrul.imprt.database;

import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.prop.ServiceDatabase;


public interface LegalPartyService extends ServiceDatabase<LegalParty> {
    void saveGraph(LegalParty legalParty);
}
