/*
  Author: Administration-PC
  Date: 2018/11/07 15:51 
  Copyright ： all rights reserved  
*/

package com.fus.repository.primary;

import com.fus.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity,Long> {
}
