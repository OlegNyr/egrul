package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.legal.LegalParty;

public interface LegalPartyRepository extends GraphRepository<LegalParty> {

    LegalParty findByOgrn(String ogrn, @Depth int depth);

    @Query("MATCH (n:LegalParty)-[:HISTORY_RECORDS]->(mv)-[r3:HISTORY_RECORD_DOCUMENTS]->(b) WHERE id(n)= {0} DELETE b, r3")
    void deleteHistoryRecords(Long id);


    @Query("MATCH (n:LegalParty)-[r:LEGAL_ADDRESS|OWNER_COMPANIES|HISTORY_RECORDS|LEGAL_ATTORNEYS]->(l)-[r2]->(a) " +
            " WHERE id(n)= {0}" +
            " DELETE r, r2,l")
    void deleteSecondOrder(Long id);

    @Query("MATCH (n:LegalParty)-[r:LEGAL_ADDRESS|OWNER_COMPANIES|HISTORY_RECORDS|LEGAL_ATTORNEYS]->(l)  " +
            " WHERE id(n)= {0}" +
            " DELETE r,l ")
    void deleteSecondRelationShip(Long id);

    @Query("MATCH (n:LegalParty)-[r]->() " +
            " WHERE id(n)= {0}" +
            " DELETE r ")
    void deleteFirstOrder(Long id);
}
