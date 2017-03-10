package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.legal.NaturalPerson;

public interface NaturalPersonRepository extends GraphRepository<NaturalPerson> {

}
