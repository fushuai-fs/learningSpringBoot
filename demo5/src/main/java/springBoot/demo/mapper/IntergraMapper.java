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

public interface IntergraMapper {

    @Insert("")
    int save(IntegralEntity integralEntity);

    @Delete("")
    int delete(Long id);

    @Update("")
    int update(IntegralEntity integralEntity);

    @Select("")
    IntegralEntity getOne(Long id);

    @SelectProvider(type = IntegralSql.class, method = "getList")
    default List<IntegralEntity> getList(IntegralParam integralParam) {
        return null;
    }

    @SelectProvider(type = IntegralSql.class, method = "getCount")
    Long getCount(IntegralParam integralParam);
}
