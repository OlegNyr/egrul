package ru.nyrk.egrul.loader;

import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.generate.egrul.DocInfoULType;

import java.util.concurrent.Future;

/**
 * todo:java doc
 */
public interface EgrulServiceAsync {
    Future<String> insertLegalPartyAsync(XmlFile xmlFile, DocInfoULType docInfoUL);
}
