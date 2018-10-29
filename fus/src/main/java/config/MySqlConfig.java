///*
//  Author: Administration-PC
//  Date: 2018/10/29 17:43
//  Copyright ： all rights reserved
//*/
//package config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManager;
//import javax.sql.DataSource;
//import java.util.Map;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactoryMySql",
//        transactionManagerRef = "transactionManagerMySql",
//        basePackages = {"mysql.dao"}) //设置Repository所在位置
//public class MySqlConfig {
//
//    @Autowired
//    private JpaProperties jpaProperties;
//    @Autowired
//    @Qualifier("mySqlDataSource")
//    private DataSource mySqlDataSource;
//
//
//    @Bean(name = "entityManagerFactoryMySql")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryMySql(EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(mySqlDataSource)
//                .properties(getVendorProperties())
//                .packages("mysql.entity") //设置实体类所在位置
//              //  .persistenceUnit("secondaryPersistenceUnit")
//                .build();
//    }
//
//    @Bean(name = "entityManagerMySql")
//    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
//        return entityManagerFactoryMySql(builder).getObject().createEntityManager();
//    }
//
//    private Map<String, Object> getVendorProperties() {
//        HibernateSettings hibernateSettings = new HibernateSettings();
//
//        return jpaProperties.getHibernateProperties(hibernateSettings);
//    }
//
//    @Bean(name = "transactionManagerMySql")
//   public   PlatformTransactionManager transactionManagerMySql(EntityManagerFactoryBuilder builder) {
//        return new JpaTransactionManager(entityManagerFactoryMySql(builder).getObject());
//    }
//}
