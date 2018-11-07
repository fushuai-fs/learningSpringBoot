/*
  Author: Administration-PC
  Date: 2018/11/07 16:17 
  Copyright ： all rights reserved  
*/

package com.fus.repository.secondary;

import com.fus.entity.PositionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends MongoRepository<PositionEntity, Long> {
}
