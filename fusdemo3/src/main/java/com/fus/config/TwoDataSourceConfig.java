package com.fus.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryTwoDataSource",
        transactionManagerRef = "transactionManagerTwoDataSource",
        basePackages = {"com.fus.two"})
public class TwoDataSourceConfig {
    @Autowired
    @Qualifier("twoDataSource")
    private DataSource twoDataSource;

    @Bean(name = "entityManagerFactoryTwoDataSource")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryTwoDataSource(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(twoDataSource)
                .properties(getVendorProperties())
                .packages("com.fus.two")
                .persistenceUnit("twoPersistenceUnit")
                .build();
    }

    @Bean(name = "entityManagerTwoDataSource")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryTwoDataSource(builder).getObject().createEntityManager();
    }

    @Autowired
    private JpaProperties jpaProperties;

//    private Map<String, String> getVendorProperties(DataSource dataSource) {
//        return jpaProperties.getHibernateProperties(dataSource);
//    }
private Map<String, String> getVendorProperties() {
    return jpaProperties.getProperties();
}
    @Bean(name = "transactionManagerTwoDataSource")
    public PlatformTransactionManager transactionManagerTwoDadaSource(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryTwoDataSource(builder).getObject());
    }

}
