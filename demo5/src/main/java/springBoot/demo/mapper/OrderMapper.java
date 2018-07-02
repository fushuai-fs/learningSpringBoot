/*
    CreateUser:fus
    CreateDate:2018年7月2日 22:22:42
    my learning spring boot
*/

package springBoot.demo.mapper;

import org.apache.ibatis.annotations.*;
import springBoot.demo.entity.OrderEntity;
import springBoot.demo.mappersql.OrderSql;
import springBoot.demo.param.OrderParam;

import java.util.List;

public interface OrderMapper {

    @Insert("")
    int save(OrderEntity orderEntity);

    @Delete("")
    int delete(Long id);

    @Update("")
    int update(OrderEntity orderEntity);

    @Select("")
    OrderEntity getOne(Long id);

    @SelectProvider(type = OrderSql.class, method = "getList")
    default List<OrderEntity> getList(OrderParam orderParam) {
        return null;
    }

    @SelectProvider(type = OrderSql.class, method = "getCount")
    Long getCount(OrderParam orderParam);
}
