package ru.nyrk.database;

import org.springframework.stereotype.Service;
import ru.nyrk.database.entity.legal.EconomicActivity;
import ru.nyrk.database.repository.EconomicActivityRepository;

@Service
public class EconomicActivityServiceImpl extends GenericService<EconomicActivity> implements EconomicActivityService {

    public EconomicActivityServiceImpl(EconomicActivityRepository graphRepository) {
        super(graphRepository);
    }

    @Override
    protected EconomicActivityRepository getGraphRepository() {
        return (EconomicActivityRepository) super.getGraphRepository();
    }

    @Override
    public EconomicActivity findByCodeOrCreate(EconomicActivity economicActivity) {
        EconomicActivity byCode = getGraphRepository().findByCode(economicActivity.getCode());
        if (byCode == null) {
            return createOrUpdate(economicActivity);
        } else {
            return byCode;
        }
    }
}
