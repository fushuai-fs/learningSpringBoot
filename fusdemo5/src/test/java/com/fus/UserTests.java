/*
  Author: Administration-PC
  Date: 2018/11/07 13:47 
  Copyright ： all rights reserved  
*/
package com.fus;

import com.fus.dao.UsersRepository;
import com.fus.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

    @Autowired
    private UsersRepository  userRepository;
    @Test
    public void testSaveUser() throws Exception {
        for (Long i=100L;i<300;i++ ) {
            UserEntity user=new UserEntity();
            user.setId(i);
            user.setUserName("小明"+i.toString());
            user.setPassWord("pass1234"+i);
            userRepository.save(user);
        }
    }

    @Test
    public void findUserByUserName(){
        List<UserEntity> user= userRepository.findByUserName("小明");
        System.out.println("-----********************************************-----");
        System.out.println("user is "+user);
        System.out.println("-----********************************************-----");
    }

    @Test
    public void updateUser(){
        UserEntity user=new UserEntity();
        user.setId(211L);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        userRepository.save(user);
    }

    @Test
    public void deleteUserById(){
        userRepository.deleteById(211L);
    }


    @Test
    public void testPage(){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
//        Pageable pageable = new PageRequest(3, 10, sort);
        Pageable pageable= PageRequest.of(3, 10, sort);
        Page page=userRepository.findAll(pageable);

        System.out.println("-----********************************************-----");
        System.out.println("getTotalPages = "+ page.getTotalPages());
        System.out.println("getTotalElements = "+ page.getTotalElements());
        System.out.println("getNumber = "+ page.getNumber());
        System.out.println("users: "+page.getContent().toString());
        System.out.println("-----********************************************-----");
    }


}
