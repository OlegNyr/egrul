package ru.nyrk.egrul.database;

import ru.nyrk.egrul.database.entity.legal.LegalParty;

public interface LegalPartyService extends ServiceDatabase<LegalParty> {
    LegalParty findByOgrnOrCreate(LegalParty legalParty);
}
