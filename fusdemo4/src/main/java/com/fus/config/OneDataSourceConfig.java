package com.fus.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

//import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryOneDataSource",
        transactionManagerRef = "transactionManagerOneDataSource",
        basePackages = {"com.fus.one"})
public class OneDataSourceConfig {
    @Autowired
    @Qualifier("oneDataSource")
    private DataSource oneDataSource;

    @Primary
    @Bean(name = "entityManagerFactoryOneDataSource")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryOneDataSource(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(oneDataSource)
                .properties(getVendorProperties())
                .packages("com.fus.one")
                .persistenceUnit("onePersistenceUnit")
                .build();
    }

    @Primary
    @Bean(name = "entityManagerOneDataSource")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryOneDataSource(builder).getObject().createEntityManager();
    }

    @Autowired
    private JpaProperties jpaProperties;

    //    private Map<String, String> getVendorProperties(DataSource dataSource) {
//        return jpaProperties.getHibernateProperties(dataSource);
//    }
    private Map<String, String> getVendorProperties() {
        return jpaProperties.getProperties();
    }

    @Primary
    @Bean(name = "transactionManagerOneDataSource")
    public PlatformTransactionManager transactionManagerOneDadaSource(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryOneDataSource(builder).getObject());
    }


}
