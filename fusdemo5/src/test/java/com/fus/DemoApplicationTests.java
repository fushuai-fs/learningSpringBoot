package com.fus;

import com.fus.dao.UserDao;
import com.fus.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserDao userDao;
	@Test
	public void testSaveUser() throws Exception {
		UserEntity user=new UserEntity();
		user.setId(22L);
		user.setUserName("小明");
		user.setPassWord("pass1234");
		userDao.saveUser(user);
	}

	@Test
	public void findUserByUserName(){
		UserEntity user= userDao.findUserByUserName("小明");
        System.out.println("-----********************************************-----");
		System.out.println("user is "+user);
		System.out.println("-----********************************************-----");
	}

	@Test
	public void updateUser(){
		UserEntity user=new UserEntity();
		user.setId(2L);
		user.setUserName("天空");
		user.setPassWord("fffxxxx");
		userDao.updateUser(user);
	}

	@Test
	public void deleteUserById(){
		userDao.deleteUserById(2L);
	}


}
