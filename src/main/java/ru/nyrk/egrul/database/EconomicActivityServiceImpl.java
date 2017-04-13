package ru.nyrk.egrul.database;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.legal.EconomicActivity;
import ru.nyrk.egrul.database.repository.EconomicActivityRepository;

@Service
public class EconomicActivityServiceImpl extends GenericService<EconomicActivity, EconomicActivityRepository> implements EconomicActivityService {

    public EconomicActivityServiceImpl(EconomicActivityRepository graphRepository) {
        super(graphRepository);
    }

    @Override
    @Cacheable(cacheNames = "EconomicActivity", unless="#result == null")
    public EconomicActivity findByCode(String kodOKVED) {
        return repository.findByCode(kodOKVED);
    }
}
