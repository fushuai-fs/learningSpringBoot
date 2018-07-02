/*
  Author: Administration-PC
  Date: 2018/07/02 09:50 
  Copyright ： all rights reserved  
*/
package springBoot.demo.param;

import java.util.Date;

public class ClientParam extends BasicParam {

    private String name = "";
    private Long cusID = 0L;
    private Date beginDate = null;
    private Date endDate = null;
    private String mobile = "";
    private Integer type = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCusID() {
        return cusID;
    }

    public void setCusID(Long cusID) {
        this.cusID = cusID;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
