/*
  Author: Administration-PC
  Date: 2018/11/07 13:45 
  Copyright ： all rights reserved  
*/

package com.fus.dao;

import com.fus.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface UsersRepository extends MongoRepository<UserEntity, Long> {
    List<UserEntity> findByUserName(String userName);


     Page<UserEntity> findAll(Pageable pageable);
}
