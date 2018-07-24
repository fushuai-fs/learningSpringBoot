package springBoot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.param.ClientParam;
import springBoot.demo.service.ClientService;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientTest {


    @Autowired
    private ClientService clientService;

    @Test
    public  void test(){

        ClientParam clientParam =new ClientParam();
        clientParam.setName("ffu");
        List<ClientEntity> clientList = clientService.getList(clientParam);

        System.out.println("*******************************************");
        System.out.println(clientList.size());
        System.out.println("*******************************************");

        long count = clientService.getCount(clientParam);

        System.out.println("*******************************************");
        System.out.println("总数="+count);
    }
}
