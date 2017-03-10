package ru.nyrk.egrul.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.NaturalPersonService;
import ru.nyrk.egrul.database.entity.legal.NaturalPerson;
import ru.nyrk.generate.egrul.InfoFLEGRULType;

@Service
public class EgrulPersonServiceHelper {
    @Autowired
    NaturalPersonService naturalPersonService;

    public NaturalPerson makeNaturalPerson(InfoFLEGRULType info) {
        NaturalPerson naturalPerson = new NaturalPerson();
        naturalPerson.setInn(info.getInnFl());
        naturalPerson.setFirstName(info.getName());
        naturalPerson.setMiddleName(info.getMiddleName());
        naturalPerson.setLastName(info.getFamily());
        return naturalPersonService.createOrUpdate(naturalPerson);
    }
}
