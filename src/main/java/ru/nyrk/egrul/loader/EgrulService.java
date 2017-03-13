package ru.nyrk.egrul.loader;

import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.generate.egrul.DocInfoULType;

/**
 * Загрузка XML в БД
 */
public interface EgrulService {
    LegalParty insertLegalParty(XmlFile xmlFile, DocInfoULType docInfoUL);
}
