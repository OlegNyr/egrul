package ru.nyrk.egrul.loader;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import ru.nyrk.egrul.EgrulApplication;
import ru.nyrk.egrul.MockConfig;

/**
 * todo:java doc
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EgrulApplication.class)
@ContextConfiguration(classes = MockConfig.class)
@Rollback(value = false)
//@ActiveProfiles("test")
public class EgrulServiceUpdateDublicate {
/*
    public static final String OGRN_MAIN = "1065405116578";
    public static final String OGRN_OWNER = "1065405119185";
    private static final Logger logger = LoggerFactory.getLogger(EgrulServiceUpdateDublicate.class);
    static EGRUL egrul;

    @Autowired
    Session session;
    @Autowired
    TransactionTemplate transactionTemplate;
    @Autowired
    XmlFileRepository xmlFileRepository;
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
    public void contextTwoAsync() throws FileNotFoundException, ExecutionException, InterruptedException {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(2);
        threadPoolTaskExecutor.setCorePoolSize(2);
        threadPoolTaskExecutor.setThreadGroupName("loadXML");
        threadPoolTaskExecutor.setThreadNamePrefix("loafXML-");
        threadPoolTaskExecutor.initialize();

        EGRUL egrul = getEgrul();
        Optional<DocInfoULType> ulType = findByOgrn(egrul, OGRN_MAIN);
        Optional<DocInfoULType> ulType2 = findByOgrn(egrul, "1076320014649");
        XmlFile xmlFile = XmlFile.newBuilder().build();
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                transactionTemplate.execute(status -> {
                    try {
                        save(ulType, xmlFile);
                        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
                        save(ulType2, xmlFile);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                });
                return null;
            }
        };

        Callable callable2 = new Callable() {
            @Override
            public Object call() throws Exception {
                transactionTemplate.execute(status -> {
                    try {
                        save(ulType2, xmlFile);
                        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
                        save(ulType, xmlFile);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                });
                return null;
            }
        };


        try {
            Future submit = threadPoolTaskExecutor.submit(callable);
            Future submit2 = threadPoolTaskExecutor.submit(callable2);
            logger.info("{}", submit.get());
            logger.info("{}", submit2.get());
        }catch (Throwable throwable){

        }
        try {
            Future submit = threadPoolTaskExecutor.submit(callable);
            Future submit2 = threadPoolTaskExecutor.submit(callable2);
            logger.info("{}", submit.get());
            logger.info("{}", submit2.get());
        }catch (Throwable throwable){

        }

    }

    private String save(Optional<DocInfoULType> ulType, XmlFile xmlFile) throws InterruptedException {
        try {
            egrulService.insertLegalParty(XmlFile.newBuilder().build(), ulType.get());
            return "OK";
        } catch (RuntimeException th) {
            logger.info("{}", th);
            return ExceptionUtils.getMessage(th);
        }
    }

    @Test
    public void name() throws Exception {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(20);
        threadPoolTaskExecutor.setCorePoolSize(20);
        threadPoolTaskExecutor.setThreadGroupName("loadXML");
        threadPoolTaskExecutor.setThreadNamePrefix("loafXML-");
        threadPoolTaskExecutor.initialize();
        List<Future<String>> futureList = Lists.newArrayList();
        for (int i = 0; i < 50; i++) {
            Callable callable = () -> {
                try {
                    transactionTemplate.execute(status -> {

                        xmlFileRepository.load();
                        return null;
                    });
                } catch (Throwable th) {
                    logger.error("{}", th);
                }
                return "ok";
            };
            futureList.add(threadPoolTaskExecutor.submit(callable));
        }
        for (Future<String> future : futureList) {
            if (!future.get().equals("ok")) throw new RuntimeException(future.get());
        }

        System.out.println("HELLO!!!!!!!!!!!!!!!!");
    }

    @Test
    public void contextLoadsAsync() throws FileNotFoundException, ExecutionException, InterruptedException {

        EGRUL egrul = getEgrul();
        XmlFile xmlFile = XmlFile.newBuilder().build();
        List<Future<String>> futureList = Lists.newArrayList();
        logger.info("Start submit");
        for (DocInfoULType docInfoULType : egrul.getDocInfoUL()) {

            futureList.add(egrulServiceAsync.insertLegalPartyAsync(xmlFile, docInfoULType));
        }
        logger.info("end submit");
        for (Future<String> future : futureList) {
            future.get();
            //if(!future.get().equals("OK")) throw new RuntimeException(future.get());
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
*/
}
