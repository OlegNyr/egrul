package ru.nyrk.egrul.imprt.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.legal.*;
import ru.nyrk.egrul.imprt.repo.*;

import javax.annotation.PostConstruct;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class LegalPartyServiceImpl extends GenericService<LegalParty, LegalPartyRepository> implements LegalPartyService {

    private AtomicLong sequence;
    private AtomicLong sequenceAddress;
    private AtomicLong sequenceHistoryRecord;
    private AtomicLong sequenceHistoryRecordDocument;
    private AtomicLong sequenceLegalAttorney;
    private AtomicLong sequenceNaturalPerson;
    private AtomicLong sequenceLegalPartyNotResident;
    private AtomicLong sequenceOwnerCompany;

    @Qualifier("addressRepository")
    @Autowired
    private AddressRepository addressRepository;
    @Qualifier("historyRecordRepository")
    @Autowired
    private HistoryRecordRepository historyRecordRepository;
    @Qualifier("historyRecordDocumentRepository")
    @Autowired
    private HistoryRecordDocumentRepository historyRecordDocumentRepository;
    @Qualifier("legalAttorneyRepository")
    @Autowired
    private LegalAttorneyRepository legalAttorneyRepository;
    @Qualifier("naturalPersonRepository")
    @Autowired
    private NaturalPersonRepository naturalPersonRepository;
    @Qualifier("ownerCompanyRepository")
    @Autowired
    private OwnerCompanyRepository ownerCompanyRepository;
    @Qualifier("notRezidentRepository")
    @Autowired
    private NotRezidentRepository notRezidentRepository;


    public LegalPartyServiceImpl(LegalPartyRepository repository) {
        super(repository);
    }

    @PostConstruct
    void init() {
        sequence = new AtomicLong(repository.count() + 1);
        sequenceAddress = new AtomicLong(addressRepository.count() + 1);
        sequenceHistoryRecord = new AtomicLong(historyRecordRepository.count() + 1);
        sequenceHistoryRecordDocument = new AtomicLong(historyRecordDocumentRepository.count() + 1);
        sequenceLegalAttorney = new AtomicLong(legalAttorneyRepository.count() + 1);
        sequenceNaturalPerson = new AtomicLong(naturalPersonRepository.count() + 1);
        sequenceLegalPartyNotResident = new AtomicLong(notRezidentRepository.count() + 1);
        sequenceOwnerCompany = new AtomicLong(ownerCompanyRepository.count() + 1);
    }

    @Override
    public void saveGraph(LegalParty legalParty) {
        saveAddress(legalParty.getLegalAddress());
        saveOwnerCompanies(legalParty.getOwnerCompanies());
        legalParty.setId(sequence.getAndIncrement());
        createOrUpdate(legalParty);
        saveHistoryRecords(legalParty, legalParty.getHistoryRecords());
        saveLegalAttorneys(legalParty, legalParty.getLegalAttorneys());

    }

    private void saveOwnerCompanies(Set<OwnerCompany> ownerCompanies) {
        if (ownerCompanies == null) {
            return;
        }
        for (OwnerCompany ownerCompany : ownerCompanies) {
//            ownerCompany.setLegalParty(null);
//            ownerCompany.setLegalPartyNotResident(null);
//            ownerCompany.setNaturalPerson(null);
            saveNaturalPerson(ownerCompany.getNaturalPerson());
            if (ownerCompany.getLegalParty() != null) {
                saveGraph(ownerCompany.getLegalParty());
            }
            saveNotRezident(ownerCompany.getLegalPartyNotResident());
            ownerCompany.setId(sequenceOwnerCompany.getAndIncrement());
            ownerCompanyRepository.save(ownerCompany);
        }
    }

    private void saveNotRezident(LegalNotResident legalPartyNotResident) {
        if (legalPartyNotResident == null) {
            return;
        }
        legalPartyNotResident.setId(sequenceLegalPartyNotResident.getAndIncrement());
        notRezidentRepository.save(legalPartyNotResident);
    }

    private void saveLegalAttorneys(LegalParty legalParty, Set<LegalAttorney> legalAttorneys) {
        if (legalAttorneys == null) {
            return;
        }
        for (LegalAttorney legalAttorney : legalAttorneys) {
            legalAttorney.setLegalParty(legalParty);
            legalAttorney.setId(sequenceLegalAttorney.getAndIncrement());
            saveNaturalPerson(legalAttorney.getNaturalPerson());
            legalAttorneyRepository.save(legalAttorney);
        }
    }

    private void saveNaturalPerson(NaturalPerson naturalPerson) {
        if (naturalPerson != null) {
            naturalPerson.setId(sequenceNaturalPerson.getAndIncrement());
            naturalPersonRepository.save(naturalPerson);
        }
    }

    private void saveHistoryRecords(LegalParty legalParty, Set<HistoryRecord> historyRecords) {
        if (historyRecords == null) {
            return;
        }
        for (HistoryRecord historyRecord : historyRecords) {
            historyRecord.setLegalParty(legalParty);
            historyRecord.setId(sequenceHistoryRecord.getAndIncrement());
            historyRecordRepository.save(historyRecord);
            for (HistoryRecordDocument historyRecordDocument : historyRecord.getHistoryRecordDocuments()) {
                historyRecordDocument.setHistoryRecord(historyRecord);
                historyRecordDocument.setId(sequenceHistoryRecordDocument.getAndIncrement());
                historyRecordDocumentRepository.save(historyRecordDocument);
            }
        }
    }

    private void saveAddress(Address legalAddress) {
        if (legalAddress == null) {
            return;
        }
        legalAddress.setId(sequenceAddress.getAndIncrement());
        addressRepository.save(legalAddress);
    }


}
