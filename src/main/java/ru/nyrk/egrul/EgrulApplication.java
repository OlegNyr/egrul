package ru.nyrk.egrul;

import org.neo4j.ogm.config.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jProperties;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;
import ru.nyrk.egrul.loader.UpdateScheduler;
import ru.nyrk.generate.egrul.EGRUL;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "ru.nyrk.egrul.database", value = "ru.nyrk.egrul.database")
@EnableTransactionManagement
@EnableScheduling
@EnableCaching
@EnableAsync
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

//    @Bean
//    public org.neo4j.ogm.config.Configuration configuration(Neo4jProperties properties) {
//        Configuration configuration = properties.createConfiguration();
//        configuration.autoIndexConfiguration().setAutoIndex("assert");
//        return configuration;
//    }

    @Bean
    TransactionTemplate transactionTemplate(PlatformTransactionManager transactionManager) {
        return new TransactionTemplate(transactionManager);
    }

    @Bean
    CommandLineRunner commandLineRunner(UpdateScheduler updateScheduler) {
        return args -> {
            updateScheduler.execute();
        };
    }
}
