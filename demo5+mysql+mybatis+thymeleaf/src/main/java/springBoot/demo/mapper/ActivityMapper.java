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

public interface ActivityMapper {

    @Insert("INSERT INTO activity(Name,StartDate,EndDate,ProvinceID,CityID,AreaID,Address,ImgUrl,EnrollStartDate,EnrollEndDate,Status,RangeType,IsTop,Remark,AddUser)\n" +
            "VALUES(#{Name},#{StartDate},#{EndDate},#{ProvinceID},#{CityID},#{AreaID},#{Address},#{ImgUrl},#{EnrollStartDate},#{EnrollEndDate},#{Status},#{RangeType},#{IsTop},#{Remark},#{AddUser})")
    int save(ActivityEntity activityEntity);

    @Delete("delete from activity where ID=#{id}")
    int delete(Long id);

    @Update("update activity set Name=#{Name},StartDate=#{StartDate},EndDate=#{EndDate},ProvinceID=#{ProvinceID},CityID=#{CityID},AreaID=#{AreaID},Address=#{Address},ImgUrl=#{ImgUrl},EnrollStartDate=#{EnrollStartDate},EnrollEndDate=#{EnrollEndDate},Status=#{Status},\n" +
            "RangeType=#{RangeType},IsTop=#{IsTop},Remark=#{Remark},AddUser=#{AddUser},ModifyTime=NOW(),ModifyUser=#{ModifyUser} where ID=#{ID}")
    int update(ActivityEntity activityEntity);

    @Select("select * from activity where ID=#{id}")
    ActivityEntity getOne(Long id);

//    @SelectProvider(type = ActivitySql.class, method = "getList")
//    default List<ActivityEntity> getList(ActivityParam activityParam) {
//        return null;
//    }
//
//    @SelectProvider(type = ActivitySql.class, method = "getCount")
//    Long getCount(ActivityParam activityParam);
}