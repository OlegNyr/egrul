package ru.nyrk.database.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.database.entity.legal.NaturalPerson;

public interface NaturalPersonRepository extends GraphRepository<NaturalPerson> {
    NaturalPerson findByInn(String inn);
}
