package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.ArchiveFile;

import java.util.Date;

public interface LoadedFileRepository extends GraphRepository<ArchiveFile> {
    @Query("MATCH (a:ArchiveFile {status:\"COMPLETE\"})\n" +
            "WITH a, max(a.dateFile) as max\n" +
            "where a.dateFile = max\n" +
            "RETURN a")
    ArchiveFile lastArchiveFileComplete();
    @Depth(value = 1)
    ArchiveFile findByDateFileAndFileId(Date dateFile, Integer fileId);
}
