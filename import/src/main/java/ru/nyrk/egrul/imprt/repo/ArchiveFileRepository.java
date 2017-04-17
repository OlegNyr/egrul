package ru.nyrk.egrul.imprt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nyrk.egrul.database.entity.ArchiveFile;

import java.util.Date;

/**
 * todo:java doc
 */
public interface ArchiveFileRepository extends JpaRepository<ArchiveFile, Long> {
    @Query("select a from ArchiveFile a where a.dateFile = (select max(b.dateFile) from ArchiveFile b where b.status = 0)")
    ArchiveFile lastArchiveFileComplete();

    ArchiveFile findByDateFileAndFileId(Date dateFile, Integer fileId);
}
