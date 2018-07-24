/*
    CreateUser:fus
    CreateDate: 2018年7月2日 22:15:13
    my learning spring boot
*/

package springBoot.demo.mapper;

import org.apache.ibatis.annotations.*;
import springBoot.demo.entity.IntegralEntity;
import springBoot.demo.mappersql.IntegralSql;
import springBoot.demo.param.IntegralParam;

import java.util.List;

public interface IntegralMapper {

    @Insert("INSERT INTO integral_detail(CustomerID,ActivityID,ProductID,IntegraNum,IntegraType,ChangeType,CurrentIntegra)\n" +
            "VALUES(#{CustomerID},#{ActivityID},#{ProductID},#{IntegraNum},#{IntegraType},#{ChangeType},#{CurrentIntegra})")
     int save(IntegralEntity integralEntity);

    @Delete("delete from integral_detail where id=#{id}")
    int delete(Long id);


//    @SelectProvider(type = IntegralSql.class, method = "getList")
//    default List<IntegralEntity> getList(IntegralParam integralParam) {
//        return null;
//    }
//
//    @SelectProvider(type = IntegralSql.class, method = "getCount")
//    Long getCount(IntegralParam integralParam);
}
