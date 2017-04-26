package ru.nyrk.egrul.imprt.repo;

import ru.nyrk.egrul.database.entity.legal.NaturalPerson;

public interface NaturalPersonRepository extends LongCrudRepository<NaturalPerson> {
    NaturalPerson findByKey(String key);
}
