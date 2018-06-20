package springBoot.demo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springBoot.demo.domain.User;
import springBoot.demo.domain.UserRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void save() {
        System.out.println("test hello");
// 创建10条记录
        userRepository.save(new User("AAA", 10));
        userRepository.save(new User("BBB", 20));
        userRepository.save(new User("CCC", 30));
        userRepository.save(new User("DDD", 40));
        userRepository.save(new User("EEE", 50));
        userRepository.save(new User("FFF", 60));
        userRepository.save(new User("GGG", 70));
        userRepository.save(new User("HHH", 80));
        userRepository.save(new User("III", 90));
        userRepository.save(new User("JJJ", 100));

    }

    @Test
    public void delete() {
        Long id = 1L;
        userRepository.deleteById(id);

        userRepository.delete(userRepository.findByName("AAA"));

    }

    @Test
    public void serach() {
        // 测试findAll, 查询所有记录
//        Assert.assertEquals(11, userRepository.findAll().size());

        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            System.out.println(user.getId());
            System.out.println(user.getName());
        }


    }

}
