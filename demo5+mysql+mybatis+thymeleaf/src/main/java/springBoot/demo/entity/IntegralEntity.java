package springBoot.demo.entity;

import java.util.Date;

public class IntegralEntity extends BasicEntity {

    private Long ID;
    private Long CustomerID;
    private Long ActivityID;
    private Long ProductID;
    private Integer IntegraNum;
    private Integer IntegraType;
    private Date AddTime;
    private Integer ChangeType;
    private Integer CurrentIntegra;


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Long customerID) {
        CustomerID = customerID;
    }

    public Long getActivityID() {
        return ActivityID;
    }

    public void setActivityID(Long activityID) {
        ActivityID = activityID;
    }

    public Long getProductID() {
        return ProductID;
    }

    public void setProductID(Long productID) {
        ProductID = productID;
    }

    public Integer getIntegraNum() {
        return IntegraNum;
    }

    public void setIntegraNum(Integer integraNum) {
        IntegraNum = integraNum;
    }

    public Integer getIntegraType() {
        return IntegraType;
    }

    public void setIntegraType(Integer integraType) {
        IntegraType = integraType;
    }

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }

    public Integer getChangeType() {
        return ChangeType;
    }

    public void setChangeType(Integer changeType) {
        ChangeType = changeType;
    }

    public Integer getCurrentIntegra() {
        return CurrentIntegra;
    }

    public void setCurrentIntegra(Integer currentIntegra) {
        CurrentIntegra = currentIntegra;
    }
}
