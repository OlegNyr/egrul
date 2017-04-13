package ru.nyrk.egrul.loader.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.legal.NaturalPerson;
import ru.nyrk.generate.egrul.InfoFLEGRULType;

@Service
public class EgrulPersonServiceHelper {
    private static final Logger logger = LoggerFactory.getLogger(EgrulPersonServiceHelper.class);

    public NaturalPerson makeNaturalPerson(InfoFLEGRULType info) {
        String key = info.getInnFl() != null ? info.getInnFl() : info.getName() + info.getMiddleName() + info.getFamily();
        NaturalPerson naturalPerson = new NaturalPerson();
        naturalPerson.setKey(key);
        naturalPerson.setInn(info.getInnFl());
        naturalPerson.setFirstName(info.getName());
        naturalPerson.setMiddleName(info.getMiddleName());
        naturalPerson.setLastName(info.getFamily());
        return naturalPerson;
    }
}
