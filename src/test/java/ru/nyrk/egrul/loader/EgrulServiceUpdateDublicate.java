package ru.nyrk.egrul.loader;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.ResourceUtils;
import ru.nyrk.egrul.EgrulApplication;
import ru.nyrk.egrul.MockConfig;
import ru.nyrk.egrul.database.LegalPartyService;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.egrul.database.entity.legal.LegalAttorney;
import ru.nyrk.egrul.database.entity.legal.LegalParty;
import ru.nyrk.generate.egrul.DocInfoULType;
import ru.nyrk.generate.egrul.EGRUL;

import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Optional;

/**
 * todo:java doc
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EgrulApplication.class)
@ContextConfiguration(classes = MockConfig.class)
@Rollback(value = false)
@ActiveProfiles("test")
public class EgrulServiceUpdateDublicate {

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

    @Test
    public void contextLoads() throws FileNotFoundException {
        transactionTemplate.execute(status -> {
            session.purgeDatabase();
            return null;
        });

        EGRUL egrul = getEgrul();
        Optional<DocInfoULType> ulType = findByOgrn(egrul, "1065405116578");
        Optional<DocInfoULType> ulType2 = findByOgrn(egrul, "1065405119185");

        egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType.get());
        LegalParty legalPartyFind =
                legalPartyService.findByOgrn("1065405116578", 1);
        egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType.get());
        LegalParty legalPartyFind2 =
                legalPartyService.findByOgrn("1065405116578", 1);
        egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType2.get());


        Assert.assertEquals(legalPartyFind, legalPartyFind2);
        System.out.println(egrul.getDocInfoUL().size());

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
