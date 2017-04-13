package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.legal.EconomicActivity;
import ru.nyrk.egrul.database.entity.legal.OwnerCompany;

/**
 * Работа со справочником ОКВЭД
 */
public interface OwnerCompanyRepository extends GraphRepository<OwnerCompany> {
}
