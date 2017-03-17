package ru.nyrk.egrul.loader;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.neo4j.driver.v1.exceptions.TransientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import ru.nyrk.egrul.database.entity.XmlFile;
import ru.nyrk.generate.egrul.DocInfoULType;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * todo:java doc
 */
@Service
public class EgrulServiceAsyncImpl implements EgrulServiceAsync {

    private static final Logger logger = LoggerFactory.getLogger(EgrulServiceAsyncImpl.class);
    private final AsyncTaskExecutor asyncTaskExecutor;
    private final EgrulService egrulService;

    @Autowired
    public EgrulServiceAsyncImpl(EgrulService egrulService) {
        this.egrulService = egrulService;
        this.asyncTaskExecutor = makeThreadPoolTaskExecutor(1);
    }

    private ThreadPoolTaskExecutor makeThreadPoolTaskExecutor(int size) {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(size);
        threadPoolTaskExecutor.setCorePoolSize(size);
        threadPoolTaskExecutor.setThreadGroupName("loadXML");
        threadPoolTaskExecutor.initialize();

        return threadPoolTaskExecutor;
    }

    @Override
    public Future<String> insertLegalPartyAsync(XmlFile xmlFile, DocInfoULType docInfoUL) {
        return asyncTaskExecutor.submit(() -> {
            try {
                egrulService.insertLegalParty(xmlFile, docInfoUL);
                return "OK";
            } catch (TransientException transientException) {
                if (transientException.code().equals("Neo.TransientError.Transaction.DeadlockDetected")) {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
                    egrulService.insertLegalParty(xmlFile, docInfoUL);
                    return "OK";
                }
                logger.error("insert doc info UL {} code {}", docInfoUL.getOGRN(), transientException.code());
                return ExceptionUtils.getMessage(transientException);
            } catch (Throwable th) {
                logger.error("insert doc info UL {}", docInfoUL.getOGRN(), th);
                return ExceptionUtils.getMessage(th);
            }
        });

    }
}
