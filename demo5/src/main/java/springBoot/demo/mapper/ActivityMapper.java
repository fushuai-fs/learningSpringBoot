/*
    CreateUser:fus
    CreateDate: 2018年7月2日 22:13:13
    my learning spring boot
*/
package springBoot.demo.mapper;

import org.apache.ibatis.annotations.*;
import springBoot.demo.entity.ActivityEntity;
import springBoot.demo.mappersql.ActivitySql;
import springBoot.demo.param.ActivityParam;

import java.util.List;
@Mapper
public interface ActivityMapper {

    @Insert("")
    int save(ActivityEntity activityEntity);

    @Delete("")
    int delete(Long id);

    @Update("")
    int update(ActivityEntity activityEntity);

    @Select("")
    ActivityEntity getOne(Long id);

    @SelectProvider(type = ActivitySql.class, method = "getList")
    default List<ActivityEntity> getList(ActivityParam activityParam) {
        return null;
    }

    @SelectProvider(type = ActivitySql.class, method = "getCount")
    Long getCount(ActivityParam activityParam);
}