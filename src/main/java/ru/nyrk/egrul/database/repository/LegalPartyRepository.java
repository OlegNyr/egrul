package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.legal.LegalParty;

public interface LegalPartyRepository extends GraphRepository<LegalParty> {
    @Depth(value = 0)
    LegalParty findByOgrn(String ogrn);
}