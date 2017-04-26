package ru.nyrk.egrul.imprt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nyrk.egrul.database.entity.ArchiveFile;

import java.util.Date;

/**
 * todo:java doc
 */
public interface ArchiveFileRepository extends LongCrudRepository<ArchiveFile> {
    @Query("select a from ArchiveFile a " +
            "where a.fileId = ( " +
            "       select max(aa.fileId) from ArchiveFile aa \n" +
            "           where a.dateFile = aa.dateFile and  aa.status = 0 and " +
            "           aa.dateFile = " +
            "               (select max(b.dateFile) " +
            "               from ArchiveFile b where b.status = 0) \n" +
            "       ) ")
    ArchiveFile lastArchiveFileComplete();

    ArchiveFile findByDateFileAndFileId(Date dateFile, Integer fileId);
}
