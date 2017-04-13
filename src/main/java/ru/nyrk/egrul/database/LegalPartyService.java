package ru.nyrk.egrul.database;

import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.prop.ServiceDatabase;

public interface LegalPartyService extends ServiceDatabase<LegalParty> {

    LegalParty findByOgrn(String ogrn, int dept);

    LegalParty findByOgrnOrCreate(LegalParty legalParty);
}
