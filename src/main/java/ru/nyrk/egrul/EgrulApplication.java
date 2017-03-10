package ru.nyrk.egrul;

import org.neo4j.ogm.config.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jProperties;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.nyrk.egrul.database.EconomicActivityService;
import ru.nyrk.egrul.database.entity.legal.EconomicActivity;
import ru.nyrk.generate.egrul.EGRUL;
import ru.nyrk.egrul.loader.UpdateScheduler;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "ru.nyrk.egrul.database", value = "ru.nyrk.egrul.database")
@EnableTransactionManagement
@EnableScheduling
public class EgrulApplication {

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(EGRUL.class);
        return marshaller;
    }

    @Bean
    public JsonParser jsonParser() {
        return JsonParserFactory.getJsonParser();
    }

    @Bean
    public org.neo4j.ogm.config.Configuration configuration(Neo4jProperties properties) {
        Configuration configuration = properties.createConfiguration();
        configuration.autoIndexConfiguration().setAutoIndex("assert");
        return configuration;
    }

    public static void main(String[] args) {
        SpringApplication.run(EgrulApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UpdateScheduler updateScheduler, EconomicActivityService economicActivityService) {
        return args -> {
//            updateScheduler.execute();
//            "UNWIND {rows} as row " +
//                    "MERGE (n:`EconomicActivity`{code: row.props.code}) " +
//                    "SET n=row.props RETURN row.nodeRef as ref, ID(n) as id, row.type as type with params {rows=[{nodeRef=-711320119, type=node, props={code=94.99111}}]}"

            economicActivityService.createOrUpdate(new EconomicActivity("94.99111", null), 3);

        };
//
//
//
    }
}
