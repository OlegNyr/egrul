package ru.nyrk.egrul.conf;

import org.neo4j.ogm.autoindex.AutoIndexMode;
import org.neo4j.ogm.config.DriverConfiguration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;

@Configuration
@EnableNeo4jRepositories(basePackages = {"ru.nyrk.egrul.database.entity", "ru.nyrk.egrul.database.repository"})
@EnableTransactionManagement(proxyTargetClass = true)
@EnableCaching
@EnableConfigurationProperties(Neo4jProperties.class)
public class Neo4jConfiguration {

    @Bean
    public org.neo4j.ogm.config.Configuration configuration(Neo4jProperties properties) {
        org.neo4j.ogm.config.Configuration configuration = properties.createConfiguration();
        configuration.set(DriverConfiguration.CONNECTION_POOL_SIZE[0], "10");
        configuration.autoIndexConfiguration().setAutoIndex(AutoIndexMode.DUMP.name());
        return configuration;
    }

//    @Bean
//    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public Session session(SessionFactory sessionFactory) throws Exception {
//        return sessionFactory.openSession();
//    }

    @Bean
    public SessionFactory sessionFactory(org.neo4j.ogm.config.Configuration configuration) {
        SessionFactory sessionFactory = new SessionFactory(configuration,
                Neo4jConfiguration.class.getAnnotation(EnableNeo4jRepositories.class).basePackages());
        return sessionFactory;
    }

    @Bean
    public Neo4jTransactionManager transactionManager(SessionFactory sessionFactory,
                                                      ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
        return customize(new Neo4jTransactionManager(sessionFactory),
                transactionManagerCustomizers.getIfAvailable());
    }

    private Neo4jTransactionManager customize(Neo4jTransactionManager transactionManager,
                                              TransactionManagerCustomizers customizers) {
        if (customizers != null) {
            customizers.customize(transactionManager);
        }
        return transactionManager;
    }


    @Bean
    TransactionTemplate transactionTemplate(PlatformTransactionManager transactionManager) {
        return new TransactionTemplate(transactionManager);
    }

}
