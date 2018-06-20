package springBoot.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springBoot.demo.domain.User;
import springBoot.demo.domain.UserRepository;
import springBoot.demo.domain1.Message;
import springBoot.demo.domain1.MessageRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataMoreTest {
    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1(){

        System.out.print("******************************************************************************************");
        userRepository.save(new User("fus", 10)) ;
        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            System.out.print(user.getId());
            System.out.print("--");
            System.out.println(user.getName());
        }


        System.out.print("******************************************************************************************");

        messageRepository.save(new Message("o1", "aaaaaaaaaa"));
        messageRepository.save(new Message("o2", "bbbbbbbbbb"));
        messageRepository.save(new Message("o3", "cccccccccc"));
        List<Message> messageList = messageRepository.findAll();
        for (Message message : messageList) {
            System.out.print(message.getId());
            System.out.print("--");
            System.out.println(message.getName());
        }

        System.out.print("******************************************************************************************");

    }
}
