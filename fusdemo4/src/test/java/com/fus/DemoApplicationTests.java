package com.fus;

import com.fus.one.User;
import com.fus.one.UserRepository;
import com.fus.two.Message;
import com.fus.two.MessageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MessageRepository messageRepository;

	@Test
	public void test() throws Exception {

		userRepository.save(new User("aaa1", 10,new Date()));
		userRepository.save(new User("bbb2", 20,new Date()));
		userRepository.save(new User("ccc3", 30,new Date()));
		userRepository.save(new User("ddd4", 40,new Date()));
		userRepository.save(new User("eee5", 50,new Date()));

		//Assert.assertEquals(5, userRepository.findAll().size());

		messageRepository.save(new Message("oa1", "aaaaaaaaa1a",new Date()));
		messageRepository.save(new Message("oa2", "bbbbbbbbb2b",new Date()));
		messageRepository.save(new Message("oa3", "ccccccccc3c",new Date()));

		// Assert.assertEquals(3, messageRepository.findAll().size());

	}
}
