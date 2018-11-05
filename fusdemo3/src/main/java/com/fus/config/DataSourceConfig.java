package com.fus.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
//    @Bean(name = "oneDataSource")
//    @Qualifier("oneDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.oneDataSource")
//    public DataSource oneDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "twoDataSource")
//    @Qualifier("twoDataSource")
//    @Primary
//    @ConfigurationProperties(prefix="spring.datasource.twoDataSource")
//    public DataSource twoDataSource() {
//        return DataSourceBuilder.create().build();
//    }




    @Bean(name = "oneDataSourceProperties")
    @Qualifier("oneDataSourceProperties")
    @ConfigurationProperties(prefix="spring.datasource.one")
    @Primary
    public DataSourceProperties oneDataSourceProperties(){
        return  new DataSourceProperties();
    }

    @Bean(name = "oneDataSource")
    @Qualifier("oneDataSource")
    @ConfigurationProperties(prefix="spring.datasource.one")
    @Primary
    public DataSource oneDataSource(){
        return oneDataSourceProperties().initializeDataSourceBuilder().build();
//        return  DataSourceBuilder.create().build();
    }

    @Bean(name = "twoDataSourceProperties")
    @Qualifier("twoDataSourceProperties")
    @ConfigurationProperties(prefix="spring.datasource.two")
    public DataSourceProperties twoDataSourceProperties(){
        return  new DataSourceProperties();
    }

    @Bean(name = "twoDataSource")
    @Qualifier("twoDataSource")
    @ConfigurationProperties(prefix="spring.datasource.two")
    public DataSource twoDataSource(){
        return twoDataSourceProperties().initializeDataSourceBuilder().build();
//        return  DataSourceBuilder.create().build();
    }
}
