package ru.nyrk.egrul.database;

import com.google.common.collect.ImmutableMap;
import org.neo4j.ogm.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.database.repository.LegalPartyRepository;

import java.util.Collections;
import java.util.Map;

@Service
public class LegalPartyServiceImpl extends GenericService<LegalParty> implements LegalPartyService {
    public static final int DEPT = 4;
    private static final Logger logger = LoggerFactory.getLogger(LegalPartyServiceImpl.class);

    @Autowired
    private Session session;

    @Autowired
    public LegalPartyServiceImpl(LegalPartyRepository graphRepository) {
        super(graphRepository);
    }

    @Override
    protected LegalPartyRepository getGraphRepository() {
        return (LegalPartyRepository) super.getGraphRepository();
    }

    @Override
    @Transactional
    public LegalParty findByOgrn(String ogrn, int dept) {
        return getGraphRepository().findByOgrn(ogrn, dept);
    }

    @Override
    @Transactional
    public LegalParty findByOgrnOrCreate(LegalParty legalPartyNew) {
        LegalParty findLegalPartyOld = getGraphRepository().findByOgrn(legalPartyNew.getOgrn(), DEPT);
        if (findLegalPartyOld == null) {
            logger.debug("Save legal party {}", legalPartyNew.getOgrn());
            return createOrUpdate(legalPartyNew, 2);
        } else {
            logger.debug("Save legal party update {}", legalPartyNew.getOgrn());
            Map<String, Long> prm = ImmutableMap.of("0", findLegalPartyOld.getId());
            session.query("MATCH (n:LegalParty)-[:HISTORY_RECORDS]->(mv)-[r3:HISTORY_RECORD_DOCUMENTS]->(b) WHERE id(n)= {0} DELETE b, r3", prm);

            session.query("MATCH (n:LegalParty)-[r:LEGAL_ADDRESS|OWNER_COMPANIES|HISTORY_RECORDS|LEGAL_ATTORNEYS]->(l)-[r2]->(a) " +
                    " WHERE id(n)= {0}"+
                    " DELETE r, r2,l", prm);
            session.query("MATCH (n:LegalParty)-[r:LEGAL_ADDRESS|OWNER_COMPANIES|HISTORY_RECORDS|LEGAL_ATTORNEYS]->(l)  " +
                    " WHERE id(n)= {0}" +
                    " DELETE r,l ", prm);
            session.query("MATCH (n:LegalParty)-[r]->() " +
                    " WHERE id(n)= {0} "+
                    " DELETE r ", prm);

            session.detachNodeEntity(findLegalPartyOld.getId());
            legalPartyNew.setId(findLegalPartyOld.getId());
            return createOrUpdate(legalPartyNew, 2);
        }
    }

}
