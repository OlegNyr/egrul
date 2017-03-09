package ru.nyrk.database.repository;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.database.entity.legal.NaturalPerson;

public interface NaturalPersonRepository extends GraphRepository<NaturalPerson> {
    @Depth(value = 0)
    NaturalPerson findByInn(String inn);
}
