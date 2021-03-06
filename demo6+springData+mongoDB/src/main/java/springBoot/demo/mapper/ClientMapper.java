package springBoot.demo.mapper;

import org.apache.ibatis.annotations.*;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.param.ClientParam;

import java.util.Date;
import java.util.List;

public interface ClientMapper {
    @Select("select * from Customer where id=#{id}")
    ClientEntity getOne(Long id);

    @Insert("INSERT INTO Customer ( CustomerID,FullName,Gender,Mobile,IntegralNum,HeaderUrl)" +
            "VALUES(#{CustomerID},#{FullName},#{Gender},#{Mobile},#{IntegralNum},#{HeaderUrl})")
    int add(ClientEntity client);

    @SelectProvider(type = ClientSql.class, method = "getList")
//    @Results({
//            @Result(property = "FullName", column = "FullName"),
//    })
    List<ClientEntity> getList(ClientParam clientParam);

    @Delete("delete from customer where id=#{id};")
    int delete(Long id);

    @SelectProvider(type = ClientSql.class, method = "getCount")
    Long getCount(ClientParam clientParam);

//    @SelectProvider(type = ClientSql.class, method = "getCount")
//    Long getCount(String name,
//                  Long cusID,
//                  Date beginDate,
//                  Date endDate,
//                  String mobile,
//                  Integer type);
//List<ClientEntity> getList(Integer pageNumber,
//                           Integer pageSize,
//                           String name,
//                           Long cusID,
//                           Date beginDate,
//                           Date endDate,
//                           String mobile,
//                           Integer type);

}


