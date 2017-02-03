package ru.nyrk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import ru.nyrk.database.repository.LoadedFileRepository;

@SpringBootApplication
@EnableNeo4jRepositories(basePackageClasses = LoadedFileRepository.class)
public class EgrulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgrulApplication.class, args);
    }

}
