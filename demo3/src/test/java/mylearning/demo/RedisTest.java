package mylearning.demo;


import mylearning.demo.entity.ClientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){

        redisTemplate.opsForValue().set("key", "ityouknow");
        redisTemplate.opsForValue().set("key1", "ityouknow1");
        redisTemplate.opsForValue().set("key2", "ityouknow2");

        redisTemplate.opsForValue().set("entity",new ClientEntity());

    }

}
