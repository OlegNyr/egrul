package ru.nyrk.egrul.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.egrul.database.repository.HistoryRecordRepository;
import ru.nyrk.egrul.database.repository.LegalAttorneyRepository;
import ru.nyrk.egrul.database.repository.LegalPartyRepository;
import ru.nyrk.egrul.database.repository.OwnerCompanyRepository;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;
import static org.apache.commons.collections4.CollectionUtils.removeAll;

@Service
public class LegalPartyServiceImpl extends GenericService<LegalParty, LegalPartyRepository> implements LegalPartyService {
    public static final int DEPT_ONE = 1;
    private static final Logger logger = LoggerFactory.getLogger(LegalPartyServiceImpl.class);

    @Autowired
    LegalAttorneyRepository legalAttorneyRepository;

    @Autowired
    OwnerCompanyRepository ownerCompanyRepository;

    @Autowired
    HistoryRecordRepository historyRecordRepository;

    @Autowired
    public LegalPartyServiceImpl(LegalPartyRepository graphRepository) {
        super(graphRepository);
    }

    @Override
    @Transactional
    public LegalParty findByOgrn(String ogrn, int dept) {
        return repository.findByOgrn(ogrn, dept);
    }

    @Override
    @Transactional
    public LegalParty findByOgrnOrCreate(LegalParty legalPartyNew) {
        LegalParty findLegalPartyOld = repository.findByOgrn(legalPartyNew.getOgrn(), 0);
        if (findLegalPartyOld == null) {
            logger.debug("Save legal party {}", legalPartyNew.getOgrn());
            return saveLegalParty(legalPartyNew);
        } else {
            logger.info("Save legal party update {}", legalPartyNew.getOgrn());
            deleteRelationship(findLegalPartyOld);
            legalPartyNew.setId(findLegalPartyOld.getId());
            return saveLegalParty(legalPartyNew);
        }
    }

    private void deleteRelationship(LegalParty findLegalPartyOld) {
        repository.deleteHistoryRecords(findLegalPartyOld.getId());
        repository.deleteSecondOrder(findLegalPartyOld.getId());
        repository.deleteSecondRelationShip(findLegalPartyOld.getId());
        repository.deleteFirstOrder(findLegalPartyOld.getId());
    }

    private LegalParty saveLegalParty(LegalParty legalPartyNew) {
        if (!isEmpty(legalPartyNew.getLegalAttorneys())) {
            legalAttorneyRepository.save(legalPartyNew.getLegalAttorneys(), DEPT_ONE);
        }
        if (!isEmpty(legalPartyNew.getOwnerCompanies())) {
            ownerCompanyRepository.save(legalPartyNew.getOwnerCompanies(), DEPT_ONE);
        }
        if (!isEmpty(legalPartyNew.getHistoryRecords())) {
            historyRecordRepository.save(legalPartyNew.getHistoryRecords(), DEPT_ONE);
        }
        return createOrUpdate(legalPartyNew, DEPT_ONE);
    }

}
