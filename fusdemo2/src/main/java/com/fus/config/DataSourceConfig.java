package com.fus.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "oneDataSource")
    @Qualifier("oneDataSource")
    @ConfigurationProperties(prefix="spring.datasource.oneDataSource")
    public DataSource oneDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "twoDataSource")
    @Qualifier("twoDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.twoDataSource")
    public DataSource twoDataSource() {
        return DataSourceBuilder.create().build();
    }

}
