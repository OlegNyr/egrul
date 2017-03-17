package ru.nyrk.egrul.loader;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.ResourceUtils;
import ru.nyrk.egrul.EgrulApplication;
import ru.nyrk.egrul.MockConfig;
import ru.nyrk.egrul.database.LegalPartyService;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.generate.egrul.DocInfoULType;
import ru.nyrk.generate.egrul.EGRUL;

import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * todo:java doc
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EgrulApplication.class)
@ContextConfiguration(classes = MockConfig.class)
@Rollback(value = false)
@ActiveProfiles("test")
public class EgrulServiceUpdateDublicate {

    private static final Logger logger = LoggerFactory.getLogger(EgrulServiceUpdateDublicate.class);
    public static final String OGRN_MAIN = "1065405116578";
    public static final String OGRN_OWNER = "1065405119185";
    static EGRUL egrul;

    @Autowired
    Session session;
    @Autowired
    TransactionTemplate transactionTemplate;
    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;
    @Autowired
    private EgrulService egrulService;
    @Autowired
    private LegalPartyService legalPartyService;
    @Autowired
    private EgrulServiceAsync egrulServiceAsync;

    @Test
    public void contextLoads() throws FileNotFoundException {
        transactionTemplate.execute(status -> {
            session.purgeDatabase();
            return null;
        });

        EGRUL egrul = getEgrul();
        Optional<DocInfoULType> ulType = findByOgrn(egrul, OGRN_MAIN);
        Optional<DocInfoULType> ulType2 = findByOgrn(egrul, OGRN_OWNER);

        egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType.get());
        LegalParty legalPartyFind = legalPartyService.findByOgrn(OGRN_MAIN, 1);
        egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType.get());
        LegalParty legalPartyFind2 = legalPartyService.findByOgrn(OGRN_MAIN, 1);
        egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType2.get());

        Assert.assertEquals("Сущьности до обновлеиня и после равны", legalPartyFind, legalPartyFind2);

        LegalParty legalPartyFindOwner = legalPartyService.findByOgrn(OGRN_OWNER, 1);
        Assert.assertEquals(legalPartyFindOwner.getOgrn(), OGRN_OWNER);
        Assert.assertFalse("Сущьность после обновления имеет больше данных", legalPartyFindOwner.getLegalAttorneys().isEmpty());
    }


    @Test
    public void contextLoadsAsync() throws FileNotFoundException, ExecutionException, InterruptedException {
        transactionTemplate.execute(status -> {
            session.purgeDatabase();
            return null;
        });

        EGRUL egrul = getEgrul();
        XmlFile xmlFile = XmlFile.newBuilder().build();
        List<Future<String>> futureList = Lists.newArrayList();
        logger.info("Start submit");
        for (DocInfoULType docInfoULType : egrul.getDocInfoUL()) {
            futureList.add(egrulServiceAsync.insertLegalPartyAsync(xmlFile, docInfoULType));
        }
        logger.info("end submit");
        for (Future<String> future : futureList) {
           if(!future.get().equals("OK")) throw new RuntimeException(future.get());
        }
        logger.info("end future");
    }

    @Test
    public void contextLoadOne() throws FileNotFoundException, ExecutionException, InterruptedException {

        EGRUL egrul = getEgrul();
        Optional<DocInfoULType> ulType = findByOgrn(egrul, "1127847083803");
        egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType.get());
        LegalParty legalPartyFind2 = legalPartyService.findByOgrn("1127847083803", 3);
        System.out.println(legalPartyFind2);
        egrulService.insertLegalParty(XmlFile.newBuilder().build(), findByOgrn(egrul, "1077799002710").get());

    }


    private Optional<DocInfoULType> findByOgrn(EGRUL egrul, String ogrn) {
        return egrul.getDocInfoUL().stream().filter(a -> a.getOGRN().equals(ogrn)).findFirst();
    }

    private EGRUL getEgrul() throws FileNotFoundException {
        if (egrul == null) {
            synchronized (EgrulServiceUpdateDublicate.class) {
                if (egrul == null) {
                    egrul = (EGRUL) jaxb2Marshaller.unmarshal(new StreamSource(ResourceUtils.getFile("classpath:testData.XML")));
                }
            }
        }
        return egrul;
    }

}
