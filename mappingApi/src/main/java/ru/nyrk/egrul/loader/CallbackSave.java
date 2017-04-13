package ru.nyrk.egrul.loader;

import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.LegalParty;

import java.util.List;

/**
 * todo:java doc
 */
public interface CallbackSave {
    void call(ArchiveFile archiveFile, XmlFile xmlFile, List<LegalParty> legalParties);
}
