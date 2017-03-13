package ru.nyrk.egrul.database;

import ru.nyrk.egrul.database.entity.legal.LegalParty;

public interface LegalPartyService extends ServiceDatabase<LegalParty> {

    LegalParty findByOgrn(String ogrn, int dept);

    LegalParty findByOgrnOrCreate(LegalParty legalParty);
}
