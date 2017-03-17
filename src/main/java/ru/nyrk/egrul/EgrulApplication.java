package ru.nyrk.egrul;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.nyrk.egrul.conf.Neo4jConfiguration;
import ru.nyrk.egrul.loader.UpdateScheduler;
import ru.nyrk.generate.egrul.EGRUL;

@SpringBootApplication

@EnableScheduling
@EnableAsync
@Configuration
@Import(Neo4jConfiguration.class)
public class EgrulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgrulApplication.class, args);
    }

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
    CommandLineRunner commandLineRunner(UpdateScheduler updateScheduler) {
        return args -> {
            updateScheduler.execute();
        };
    }

}
