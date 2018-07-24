package springBoot.demo.mappersql;

import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;
import springBoot.demo.param.ClientParam;

import java.util.Date;

public class ClientSql {

    public String getList(ClientParam clientParam) {
        StringBuffer sql = new StringBuffer("select * ");
        sql.append(" from customer where 1=1 ");

        if (StringUtils.isNotBlank(clientParam.getName())) {
            sql.append(" and FullName = #{name}");
        }
        if (clientParam.getCusID()>0) {
            sql.append(" and CustomerID = #{cusID}");
        }

        if (StringUtils.isNotBlank(clientParam.getMobile())) {
            sql.append(" and mobile = #{mobile}");
        }
        if (clientParam.getType()>0) {
            sql.append(" and UserType = #{type}");
        }

        if (null != clientParam.getBeginDate()) {
            sql.append(" and AddTime >= #{beginDate}");
        }
            if (null != clientParam.getEndDate()) {
            sql.append(" and AddTime <= #{endDate}");
        }
        sql.append(" order by id desc");
        sql.append(" limit " + (clientParam.getPageNumber() - 1) * clientParam.getPageSize() + "," + clientParam.getPageSize());

        return sql.toString();
    }

    public String getCount(ClientParam clientParam){
        String sqls = new SQL(){{
            SELECT ("count(1)");FROM("customer");
            if(StringUtils.isNotBlank(clientParam.getName())){
                WHERE("name=#{name}");
            }
            if (clientParam.getCusID()>0) {
                WHERE(" CustomerID = #{cusID}");
            }
            if(StringUtils.isNotBlank(clientParam.getMobile())){
                WHERE("mobile= #{mobile}");
            }
            if (clientParam.getType()>0) {
                WHERE(" UserType = #{type}");
            }

            if (null != clientParam.getBeginDate()) {
                WHERE(" AddTime >= #{beginDate}");
            }
            if (null != clientParam.getEndDate()) {
                WHERE(" AddTime <= #{endDate}");
            }
        }}.toString();
        return  sqls;
    }

}
