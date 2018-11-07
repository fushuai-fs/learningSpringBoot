/*
  Author: Administration-PC
  Date: 2018/11/07 11:51 
  Copyright ： all rights reserved  
*/

package com.fus.dao;

import com.fus.entity.UserEntity;

public interface UserDao {
    public void saveUser(UserEntity user);

    public UserEntity findUserByUserName(String userName);

    public long updateUser(UserEntity user);

    public void deleteUserById(Long id);
}
