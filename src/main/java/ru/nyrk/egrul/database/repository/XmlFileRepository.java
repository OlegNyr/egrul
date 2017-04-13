package ru.nyrk.egrul.database.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import ru.nyrk.egrul.database.entity.XmlFile;

/**
 * todo:java doc
 */
public interface XmlFileRepository extends GraphRepository<XmlFile> {
    @Query("MATCH (n:Person)-[r]->(m) RETURN n, r, m")
    void load();
}
