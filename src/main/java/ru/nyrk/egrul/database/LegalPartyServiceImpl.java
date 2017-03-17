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

import java.util.Map;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;
import static org.apache.commons.collections4.CollectionUtils.removeAll;

@Service
public class LegalPartyServiceImpl extends GenericService<LegalParty> implements LegalPartyService {
    public static final int DEPT = 1;
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
        LegalParty findLegalPartyOld = getGraphRepository().findByOgrn(legalPartyNew.getOgrn(), 0);
        if (findLegalPartyOld == null) {
            logger.debug("Save legal party {}", legalPartyNew.getOgrn());
            return saveLegalParty(legalPartyNew);
        } else {
            logger.debug("Save legal party update {}", legalPartyNew.getOgrn());
            deleteRelationship(findLegalPartyOld);
            legalPartyNew.setId(findLegalPartyOld.getId());
            return saveLegalParty(legalPartyNew);
        }
    }

    private void deleteRelationship(LegalParty findLegalPartyOld) {
        Map<String, Long> prm = ImmutableMap.of("0", findLegalPartyOld.getId());
        session.query("MATCH (n:LegalParty)-[:HISTORY_RECORDS]->(mv)-[r3:HISTORY_RECORD_DOCUMENTS]->(b) WHERE id(n)= {0} DELETE b, r3", prm);

        session.query("MATCH (n:LegalParty)-[r:LEGAL_ADDRESS|OWNER_COMPANIES|HISTORY_RECORDS|LEGAL_ATTORNEYS]->(l)-[r2]->(a) " +
                " WHERE id(n)= {0}" +
                " DELETE r, r2,l", prm);
        session.query("MATCH (n:LegalParty)-[r:LEGAL_ADDRESS|OWNER_COMPANIES|HISTORY_RECORDS|LEGAL_ATTORNEYS]->(l)  " +
                " WHERE id(n)= {0}" +
                " DELETE r,l ", prm);
        session.query("MATCH (n:LegalParty)-[r]->() " +
                " WHERE id(n)= {0} " +
                " DELETE r ", prm);
    }

    private LegalParty saveLegalParty(LegalParty legalPartyNew) {
        if (!isEmpty(legalPartyNew.getLegalAttorneys())) {
            session.save(legalPartyNew.getLegalAttorneys(), 1);
        }
        if (!isEmpty(legalPartyNew.getOwnerCompanies())) {
            session.save(legalPartyNew.getOwnerCompanies(), 1);
        }
        if (!isEmpty(legalPartyNew.getHistoryRecords())) {
            session.save(legalPartyNew.getHistoryRecords(), 1);
        }
        return createOrUpdate(legalPartyNew, 1);
    }

}
