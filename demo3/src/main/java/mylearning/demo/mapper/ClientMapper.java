/*
    CreateUser:fushuai
    CreateDate:
    my learning spring boot
*/

package mylearning.demo.mapper;

import mylearning.demo.entity.ClientEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface ClientMapper {

    @Select("select * from client where id=#{id}")
    ClientEntity getOne(Long id);

    @Insert("insert into client (age,clientName) values(#{age},#{clientName}) ")
    int add(ClientEntity client);
}
