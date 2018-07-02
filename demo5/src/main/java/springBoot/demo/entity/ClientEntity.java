package springBoot.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

public class ClientEntity extends BasicEntity {

    private Long Id;
    private Long CustomerID;
    private String FullName;
    private Integer Gender;
    private String Mobile;

    private int IntegralNum;
    private String HeaderUrl="";

    private Date AddTime;
    private Date LastLoginTime;

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }

    public Date getLastLoginTime() {
        return LastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        LastLoginTime = lastLoginTime;
    }



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Long customerID) {
        CustomerID = customerID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public int getIntegralNum() {
        return IntegralNum;
    }

    public void setIntegralNum(int integralNum) {
        IntegralNum = integralNum;
    }

    public String getHeaderUrl() {
        return HeaderUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        HeaderUrl = headerUrl;
    }
}
