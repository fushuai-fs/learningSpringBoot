/*
  Author: Administration-PC
  Date: 2018/11/12 17:02 
  Copyright ： all rights reserved  
*/
package com.baitour.mssqlmongo.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

public class UniqueNameGenerator extends AnnotationBeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        //return super.generateBeanName(definition, registry);
        return definition.getBeanClassName();
    }
}
