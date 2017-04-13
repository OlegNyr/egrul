package ru.nyrk.egrul.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.repository.NaturalPersonRepository;
import ru.nyrk.egrul.database.entity.legal.NaturalPerson;

/**
 * Имплементация управления персонами
 */
@Service
public class NaturalPersonServiceImpl extends GenericService<NaturalPerson, NaturalPersonRepository> implements NaturalPersonService {

    @Autowired
    public NaturalPersonServiceImpl(NaturalPersonRepository graphRepository) {
        super(graphRepository);
    }

    @Override
    @Cacheable(cacheNames = "NaturalPerson", unless = "#result == null")
    public NaturalPerson findByKey(String key) {
        return repository.findByKey(key);
    }
}
