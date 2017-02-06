package ru.nyrk.database.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.database.entity.ArchiveFile;

public interface LoadedFileRepository extends GraphRepository<ArchiveFile> {
}
