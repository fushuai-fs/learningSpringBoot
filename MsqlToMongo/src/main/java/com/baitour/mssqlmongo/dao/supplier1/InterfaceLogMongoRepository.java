/*
  Author: Administration-PC
  Date: 2018/11/12 10:44 
  Copyright ： all rights reserved  
*/

package com.baitour.mssqlmongo.dao.supplier1;

import com.baitour.mssqlmongo.entity.supplier1.HotelResponseEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("interfaceLogMongoRepositoryOne")
public interface InterfaceLogMongoRepository extends MongoRepository<HotelResponseEntity, Long> {
}
