/*
  Author: Administration-PC
  Date: 2018/10/29 16:56 
  Copyright ： all rights reserved  
*/
package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
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

import javax.annotation.*;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        transactionManagerRef = "transactionManagerSqlServer",
        entityManagerFactoryRef = "entityManagerFactorySqlServer",
        basePackages = {"dao"})
public class SqlServerConfig {

    @Resource
    @Qualifier("sqlServerDataSource")
    private DataSource sqlServerDataSource;


    @Bean(name = "entityManagerFactorySqlServer")
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManagerFactorySqlServer(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(sqlServerDataSource)
                .properties(getVendorProperties())
                .packages("entity") //设置实体类所在位置
//                .persistenceUnit("")
                .build();
    }

    @Bean(name = "entityManagerSqlServer")
    @Primary
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactorySqlServer(builder).getObject().createEntityManager();
    }


    @Autowired
    private JpaProperties jpaProperties;
    private Map<String, Object> getVendorProperties() {
        HibernateSettings hibernateSettings = new HibernateSettings();

        return jpaProperties.getHibernateProperties(hibernateSettings);
    }

    @Primary
    @Bean(name = "transactionManagerSqlServer")
    public PlatformTransactionManager transactionManagerSqlServer(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactorySqlServer(builder).getObject());
    }

}
