package ru.nyrk.egrul.imprt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.XmlFile;

/**
 * todo:java doc
 */
public interface XmlFileRepository extends JpaRepository<XmlFile, Long> {
}
