package ru.nyrk.database.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.database.entity.legal.LegalParty;

public interface LegalPartyRepository extends GraphRepository<LegalParty> {
    LegalParty findByOgrn(String ogrn);
}
