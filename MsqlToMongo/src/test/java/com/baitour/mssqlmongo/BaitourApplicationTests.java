package com.baitour.mssqlmongo;

import com.baitour.mssqlmongo.common.XmlHelper;
import com.baitour.mssqlmongo.dao.supplier1.InterfaceLogRepository;
import com.baitour.mssqlmongo.dao.supplier1.InterfaceLogMongoRepository;
import com.baitour.mssqlmongo.entity.supplier1.InterfaceLogEntity;
import com.baitour.mssqlmongo.entity.supplier1.HotelResponseEntity;
import org.aspectj.apache.bcel.classfile.Module;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaitourApplicationTests {

    @Autowired(required = false)
    @Qualifier(value = "InterfaceLogRepositoryOne")
    private InterfaceLogRepository repository;
    @Autowired(required = false)
    @Qualifier("interfaceLogMongoRepositoryOne")
    private InterfaceLogMongoRepository mongoRepository;

    @Test
    public void testlog() throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2018-11-06 10:00:00");

        List<InterfaceLogEntity> entityList = repository.findByAddTimeAfter(date);
//        List<InterfaceLogEntity> entityList=repository.findByOrderID(4158L);
        for (InterfaceLogEntity item : entityList) {
            System.out.println("----*****************************************----");
            System.out.println("----*****************************************----");

            System.out.println(item.getAvailID());
            System.out.println(item.getOrderID());
            System.out.println(item.getRequest());
            System.out.println(item.getResponse());


            System.out.println("----*****************************************----");
            System.out.println("----*****************************************----");
        }
    }

    @Test
    public void testlog2() throws Exception {

//        List<InterfaceLogEntity> logEntitys =  repository.findAll();
        InterfaceLogEntity logEntity = repository.findById(132L).get();
        System.out.println("----*****************************************----");
        System.out.println("----*****************************************----");

        System.out.println(logEntity.getAvailID());
        System.out.println(logEntity.getOrderID());
        System.out.println(logEntity.getRequest());
        System.out.println(logEntity.getResponse());
        System.out.println(logEntity.getAddTime());


        System.out.println("----*****************************************----");
        System.out.println("----*****************************************----");
    }

    @Test
    public void testlogConvert() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2018-11-06 10:00:00");

        List<InterfaceLogEntity> entityList = repository.findByAddTimeAfter(date);
        for (InterfaceLogEntity item : entityList) {
            if (item.getType().equals("")) {

                HotelResponseEntity entity = (HotelResponseEntity) XmlHelper.xmlToObject(HotelResponseEntity.class, item.getResponse());

                entity.setOrderID(item.getOrderID());
                entity.setAvailID(item.getAvailID());
                HotelResponseEntity mongoIthotel_priceem = mongoRepository.save(entity);

                System.out.println("-----*****************************-----");
                System.out.println(entity.getResponseType());
                System.out.println(entity.getCheckInDate());
                System.out.println(entity.getHotel().getNameChn());


                System.out.println("-----************* 测试完成 ****************-----");

            }
        }
    }

    /**
     * 下一步 Json 转换 存入 Mongodb 示例
     *  下一步 Mongodb 的查询示例
     */
}

