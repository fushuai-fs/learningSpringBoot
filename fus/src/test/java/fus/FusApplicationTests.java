package fus;

import dao.HQInterfaceLogRepository;
import entity.HQInterfaceLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.security.PublicKey;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FusApplicationTests {
//    @Resource
//    private HQInterfaceLogRepository repository;
    @Test
    public  void testtttttt(){
        System.out.println("teset");
    }
	@Test
	public void contextLoads() {

//       List<HQInterfaceLog> hqInterfaceLogs = repository.findAllByOrderID(381);
//      for (HQInterfaceLog item :hqInterfaceLogs)
//      {
//          System.out.println("response : "+item.getOrderID());
//          System.out.println("response : "+item.getResponse());
//      }
    }

}
