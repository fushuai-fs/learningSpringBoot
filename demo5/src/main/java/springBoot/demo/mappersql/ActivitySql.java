package springBoot.demo.mappersql;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;
import springBoot.demo.param.ActivityParam;

public class ActivitySql {


    public String getList(ActivityParam param) {
        StringBuffer sql = new StringBuffer("select * ");
        sql.append(" from Activity where 1=1 ");

        sql.append(" order by id desc");
        sql.append(" limit " + (param.getPageNumber() - 1) * param.getPageSize() + "," + param.getPageSize());

        return sql.toString();
    }

    public String getCount(ActivityParam param) {
        String sqls = new SQL() {{
            SELECT("count(1) ");
            FROM("customer");
//            if (StringUtils.isNotBlank(clientParam.getName())) {
//                WHERE("FullName=#{name}");
//            }
//            if (null != clientParam.getCusID() && clientParam.getCusID() > 0L) {
//                WHERE(" CustomerID = #{cusID}");
//            }

        }}.toString();
        return sqls;
    }

}
