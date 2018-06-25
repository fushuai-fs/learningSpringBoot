package mylearning.demo;


import mylearning.demo.entity.ClientEntity;
import mylearning.demo.mapper.ClientMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientTest {

    @Resource
    private ClientMapper clientMapper;

    @Test
    public void test1() {

        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setClientId(1L);
        clientEntity.setClientName("fusde");
        clientEntity.setAge(30);

        clientMapper.add(clientEntity);

    }
}
