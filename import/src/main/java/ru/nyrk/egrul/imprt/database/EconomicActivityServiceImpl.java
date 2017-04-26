package ru.nyrk.egrul.imprt.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.legal.EconomicActivity;
import ru.nyrk.egrul.imprt.repo.EconomicActivityRepository;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
public class EconomicActivityServiceImpl extends GenericService<EconomicActivity, EconomicActivityRepository> implements EconomicActivityService {
    @Autowired
    private EconomicActivityService economicActivityService;
    private Long sequence;

    public EconomicActivityServiceImpl(EconomicActivityRepository repository) {
        super(repository);
    }

    @PostConstruct
    void init() {
        sequence = repository.count();
        sequence++;
    }

    @Override
    @Cacheable(cacheNames = "EconomicActivity", unless = "#result == null")
    public EconomicActivity findByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public void createOrFind(EconomicActivity economicActivity, Set<EconomicActivity> economicActivitiesOther) {
        createOrFind(economicActivity);
        if (economicActivitiesOther != null) {
            for (EconomicActivity activity : economicActivitiesOther) {
                createOrFind(activity);
            }
        }
    }


    private void createOrFind(EconomicActivity economicActivity) {
        if (economicActivity == null) {
            return;
        }
        EconomicActivity byCode = economicActivityService.findByCode(economicActivity.getCode());
        if (byCode != null) {
            economicActivity.setId(byCode.getId());
        } else {
            economicActivity.setId(sequence++);
            createOrUpdate(economicActivity);
        }
    }
}
