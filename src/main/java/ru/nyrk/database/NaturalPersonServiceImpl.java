package ru.nyrk.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.database.repository.NaturalPersonRepository;
import ru.nyrk.database.entity.legal.NaturalPerson;

/**
 * Имплементация управления персонами
 */
@Service
public class NaturalPersonServiceImpl extends GenericService<NaturalPerson> implements NaturalPersonService {

    @Autowired
    public NaturalPersonServiceImpl(NaturalPersonRepository graphRepository) {
        super(graphRepository);
    }

    @Override
    protected NaturalPersonRepository getGraphRepository() {
        return (NaturalPersonRepository) super.getGraphRepository();
    }

    @Override
    public NaturalPerson findByInnOrCreate(NaturalPerson naturalPerson) {
        NaturalPerson person = getGraphRepository().findByInn(naturalPerson.getInn());
        if (person != null) {
            return person;
        } else {
            return createOrUpdate(naturalPerson);
        }
    }
}
