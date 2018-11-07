/*
  Author: Administration-PC
  Date: 2018/11/07 15:47 
  Copyright ： all rights reserved  
*/
package com.fus.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(mongoTemplateRef = SecondaryMongoConfig.MONGO_TEMPLATE
        ,basePackages = {"com.fus.repository.secondary"})
public class SecondaryMongoConfig {
    public static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
