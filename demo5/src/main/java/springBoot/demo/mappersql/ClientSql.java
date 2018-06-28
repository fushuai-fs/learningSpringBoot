package springBoot.demo.mappersql;

import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Date;

public class ClientSql {

    public String getList(Integer pageNumber,
                          Integer pageSize,
                          String name,
                          Long cusID,
                          Date beginDate,
                          Date endDate,
                          String mobile,
                          Integer type) {
        StringBuffer sql = new StringBuffer("select * ");
        sql.append(" from customer where 1=1 ");

        if (StringUtils.isNotBlank(name)) {
            sql.append(" and FullName = #{name}");
        }
        if (cusID>0) {
            sql.append(" and CustomerID = #{cusID}");
        }

        if (StringUtils.isNotBlank(mobile)) {
            sql.append(" and mobile = #{mobile}");
        }
        if (type>0) {
            sql.append(" and UserType = #{type}");
        }

        if (null != beginDate) {
            sql.append(" and AddTime >= #{beginDate}");
        }
            if (null != endDate) {
            sql.append(" and AddTime <= #{endDate}");
        }
        sql.append(" order by id desc");
        sql.append(" limit " + (pageNumber - 1) * pageSize + "," + pageSize);

        return sql.toString();
    }

    public String getCount(String name,
                           Long cusID,
                           Date beginDate,
                           Date endDate,
                           String mobile,
                           Integer type){
        String sqls = new SQL(){{
            SELECT ("count(1)");FROM("customer");
            if(StringUtils.isNotBlank(name)){
                WHERE("name=#{name}");
            }
            if (cusID>0) {
                WHERE(" CustomerID = #{cusID}");
            }
            if(StringUtils.isNotBlank(mobile)){
                WHERE("mobile= #{mobile}");
            }
            if (type>0) {
                WHERE(" UserType = #{type}");
            }

            if (null != beginDate) {
                WHERE(" AddTime >= #{beginDate}");
            }
            if (null != endDate) {
                WHERE(" AddTime <= #{endDate}");
            }
        }}.toString();
        return  sqls;
    }

}
