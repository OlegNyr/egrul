package ru.nyrk.egrul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.nyrk.egrul.conf.Neo4jConfiguration;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@Configuration
@Import(Neo4jConfiguration.class)
public class EgrulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgrulApplication.class, args);
    }

}
