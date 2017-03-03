package ru.nyrk.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Service;
import ru.nyrk.database.entity.legal.LegalParty;
import ru.nyrk.database.repository.LegalPartyRepository;

@Service
public class LegalPartyServiceImpl extends GenericService<LegalParty> implements LegalPartyService {

    @Autowired
    public LegalPartyServiceImpl(LegalPartyRepository graphRepository) {
        super(graphRepository);
    }

    @Override
    protected LegalPartyRepository getGraphRepository() {
        return (LegalPartyRepository) super.getGraphRepository();
    }

    @Override
    public LegalParty findByOgrnOrCreate(LegalParty legalParty) {
        LegalParty findOgrn = getGraphRepository().findByOgrn(legalParty.getOgrn());
        if (findOgrn == null) {
            return createOrUpdate(findOgrn);
        } else {
            return findOgrn;
        }

    }
}
