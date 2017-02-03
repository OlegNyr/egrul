package ru.nyrk.database.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.database.entity.LoadedFile;

public interface LoadedFileRepository extends GraphRepository<LoadedFile> {
}
