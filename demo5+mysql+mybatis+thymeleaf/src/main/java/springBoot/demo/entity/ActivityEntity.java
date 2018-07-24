package springBoot.demo.entity;

import java.util.Date;

public class ActivityEntity extends BasicEntity {

    private Long ID;
    private String Name;
    private Date StartDate;
    private Date EndDate;
    private int ProvinceID;
    private int CityID;
    private int AreaID;
    private String Address;
    private String ImgUrl;
    private Date EnrollStartDate;
    private Date EnrollEndDate;
    private int Status;
    private int RangeType;
    private boolean IsTop;
    private String Remark;
    private Date AddTime;
    private String AddUser;
    private Date PublishTime;
    private String PublishUser;
    private Date ModifyTime;
    private String ModifyUser;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public int getProvinceID() {
        return ProvinceID;
    }

    public void setProvinceID(int provinceID) {
        ProvinceID = provinceID;
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int cityID) {
        CityID = cityID;
    }

    public int getAreaID() {
        return AreaID;
    }

    public void setAreaID(int areaID) {
        AreaID = areaID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public Date getEnrollStartDate() {
        return EnrollStartDate;
    }

    public void setEnrollStartDate(Date enrollStartDate) {
        EnrollStartDate = enrollStartDate;
    }

    public Date getEnrollEndDate() {
        return EnrollEndDate;
    }

    public void setEnrollEndDate(Date enrollEndDate) {
        EnrollEndDate = enrollEndDate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getRangeType() {
        return RangeType;
    }

    public void setRangeType(int rangeType) {
        RangeType = rangeType;
    }

    public boolean isTop() {
        return IsTop;
    }

    public void setTop(boolean top) {
        IsTop = top;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }

    public String getAddUser() {
        return AddUser;
    }

    public void setAddUser(String addUser) {
        AddUser = addUser;
    }

    public Date getPublishTime() {
        return PublishTime;
    }

    public void setPublishTime(Date publishTime) {
        PublishTime = publishTime;
    }

    public String getPublishUser() {
        return PublishUser;
    }

    public void setPublishUser(String publishUser) {
        PublishUser = publishUser;
    }

    public Date getModifyTime() {
        return ModifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        ModifyTime = modifyTime;
    }

    public String getModifyUser() {
        return ModifyUser;
    }

    public void setModifyUser(String modifyUser) {
        ModifyUser = modifyUser;
    }
}
