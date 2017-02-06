package ru.nyrk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.nyrk.database.entity.Entity;
import ru.nyrk.database.repository.LoadedFileRepository;
import ru.nyrk.egrul.generate.egrul.EGRUL;
import ru.nyrk.loader.UpdateScheduler;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "ru.nyrk.database.entity")
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
    public JsonParser jsonParser(){
           return JsonParserFactory.getJsonParser();
    }

    public static void main(String[] args) {
        SpringApplication.run(EgrulApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UpdateScheduler updateScheduler){
        return args -> updateScheduler.execute();
    }
}
