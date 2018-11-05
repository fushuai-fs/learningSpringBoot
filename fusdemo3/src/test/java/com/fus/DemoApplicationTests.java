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

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MessageRepository messageRepository;

	@Test
	public void test() throws Exception {

		userRepository.save(new User("aaa1", 10));
		userRepository.save(new User("bbb2", 20));
		userRepository.save(new User("ccc3", 30));
		userRepository.save(new User("ddd4", 40));
		userRepository.save(new User("eee5", 50));

		//Assert.assertEquals(5, userRepository.findAll().size());

		messageRepository.save(new Message("oa1", "aaaaaaaaa1a"));
		messageRepository.save(new Message("oa2", "bbbbbbbbb2b"));
		messageRepository.save(new Message("oa3", "ccccccccc3c"));

		// Assert.assertEquals(3, messageRepository.findAll().size());

	}

}
