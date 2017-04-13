package ru.nyrk.egrul.imprt;

import com.google.common.collect.Lists;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.nyrk.egrul.database.entity.ArchiveFile;
import ru.nyrk.egrul.database.entity.LoadedFileError;
import ru.nyrk.egrul.database.entity.LoadedFileStatus;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.imprt.repo.ArchiveFileRepository;
import ru.nyrk.egrul.imprt.repo.XmlFileRepository;
import ru.nyrk.egrul.prop.ConfigAppProperties;

import java.util.Date;

/**
 * todo:java doc
 */
@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
@ComponentScan()
@EnableJpaRepositories
@EntityScan(basePackageClasses = ArchiveFile.class)
@EnableConfigurationProperties(ConfigAppProperties.class)
public class AppImport {
    public static void main(String[] args) {
        SpringApplication.run(AppImport.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(TestService testService) {
        return a -> {
            testService.test();
        };
    }
}
