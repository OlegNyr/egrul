package ru.nyrk.egrul;

import com.google.common.collect.Lists;
import org.neo4j.ogm.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;
import ru.nyrk.egrul.database.EconomicActivityService;
import ru.nyrk.egrul.database.EconomicActivityServiceImpl;
import ru.nyrk.egrul.database.LegalPartyService;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.*;
import ru.nyrk.egrul.loader.UpdateScheduler;
import ru.nyrk.generate.egrul.EGRUL;

import java.util.Date;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "ru.nyrk.egrul.database", value = "ru.nyrk.egrul.database")
@EnableTransactionManagement
@EnableScheduling
public class EgrulApplication {

    @Autowired
    private EconomicActivityService economicActivityService;

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

    @Bean
    TransactionTemplate transactionTemplate(PlatformTransactionManager transactionManager){
       return new TransactionTemplate(transactionManager);
    }
    public static void main(String[] args) {
        SpringApplication.run(EgrulApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UpdateScheduler updateScheduler, LegalPartyService legalPartyService) {
        return args -> {
            updateScheduler.execute();
//
//
//            OwnerCompany ownerCompany = new OwnerCompany();
//            ownerCompany.setNaturalPerson(NaturalPerson
//                    .NaturalPersonBuilder
//                    .aNaturalPerson()
//                    .withInn("0101010101")
//                    .withFirstName("testFIrstName")
//                    .withMiddleName("testMidleName")
//                    .withLastName("testLastName")
//                    .build()
//            );
//            LegalParty.Builder legalPartyBuilderOwner = LegalParty.newBuilder()
//                    .withInn("111111111111")
//                    .withOgrn("222222222222222222")
//                    .withFullName("test");
//                ownerCompany.setLegalParty(legalPartyBuilderOwner.build());
//            ownerCompany.setProportion("testPrortion");
//            XmlFile aaaa = XmlFile.newBuilder().withName("aaaa").build();
//            aaaa.setId(11111L);
//            LegalParty.Builder legalPartyBuilder = LegalParty.newBuilder()
//                    .withInn("00000000000000")
//                    .withOgrn("111111111111111111")
//                    .withFullName("test")
//                    .withBeginDate(new Date())
//                    .withOwnerCompanies(Lists.newArrayList(ownerCompany))
//                    .withLegalAddress(Address.newBuilder().withCityName("Рузаевка").build())
//                    .withEconomicActivity(new EconomicActivity("aaa", "bbbb"))
//                    .withXmlFile(aaaa);
//
//
//
////            legalPartyService.
//            legalPartyService.findByOgrnOrCreate(legalPartyBuilder.build());

        };
//
//
//
    }
}
