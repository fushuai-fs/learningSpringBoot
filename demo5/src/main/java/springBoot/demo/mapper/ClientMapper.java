package springBoot.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import springBoot.demo.entity.ClientEntity;

import java.util.List;

public interface ClientMapper {
    @Select("select * from Customer where id=#{id}")
    ClientEntity getOne(Long id);

     @Insert("INSERT INTO Customer ( CustomerID,FullName,Gender,Mobile,IntegralNum,HeaderUrl)" +
            "VALUES(#{CustomerID},#{FullName},#{Gender},#{Mobile}#{IntegralNum},#{HeaderUrl})")
    int add(ClientEntity client);

    @Select("select * from Customer ")
    List<ClientEntity> getList();
}
