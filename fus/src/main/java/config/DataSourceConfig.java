/*
  Author: Administration-PC
  Date: 2018/10/29 14:34 
  Copyright ： all rights reserved  
*/
package config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {


//    @Bean(name = "mongoDBDataSource")
//    @Qualifier("mongoDBDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.mongoDB")
//    public DataSource mongoDBDataSource() {
//        return DataSourceBuilder.create().build();
//    }

    @Bean(name = "sqlServerDataSource")
    @Qualifier("sqlServerDataSource")
    @ConfigurationProperties(prefix="spring.datasource.sqlServer")
    @Primary
    public DataSource sqlServerDataSource() {
        return DataSourceBuilder.create().build();
    }


//    @Bean(name = "mySqlDataSource")
//    @Qualifier("mySqlDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.mySql")
//    @Primary
//    public DataSource mySqlDataSource() {
//        return DataSourceBuilder.create().build();
//    }
}
