package ru.nyrk.egrul.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.repository.NaturalPersonRepository;
import ru.nyrk.egrul.database.entity.legal.NaturalPerson;

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
}
