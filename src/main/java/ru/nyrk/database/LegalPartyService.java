package ru.nyrk.database;

import ru.nyrk.database.entity.legal.LegalParty;

public interface LegalPartyService extends ServiceDatabase<LegalParty> {
    LegalParty findByOgrnOrCreate(LegalParty legalParty);
}
