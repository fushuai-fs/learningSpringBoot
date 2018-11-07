/*
  Author: Administration-PC
  Date: 2018/11/07 15:44 
  Copyright ： all rights reserved  
*/
package com.fus.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(mongoTemplateRef = PrimaryMongoConfig.MONGO_TEMPLATE
,basePackages = {"com.fus.repository.primary"})
public class PrimaryMongoConfig {
    public static final String MONGO_TEMPLATE = "primaryMongoTemplate";
}
