/*
  Author: Administration-PC
  Date: 2018/11/08 14:41 
  Copyright ： all rights reserved  
*/
package com.baitour.mssqlmongo.entity.supplier1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

public class HotelResEntity {
    //HotelID
    @XmlElement(name ="HotelID")
    private int hotelID;
    //NameChn
    @XmlElement(name ="NameChn")
    private String nameChn;
    //NameEng
    @XmlElement(name ="NameEng")
    private String nameEng;
    //Latitude
    @XmlElement(name ="Latitude")
    private String latitude;
    //Longitude
    @XmlElement(name ="Longitude")
    private String longitude;
    //Remarks
    @XmlElement(name ="Remarks")
    private String remarks;
    //Address
    @XmlElement(name ="Address")
    private String address;
    //RateInfoList
//    @XmlElementWrapper(name = "RateInfoList")
//    @XmlElement(name ="RateInfo")
//    private List<RateInfoEntity> rateInfoList;
//
//    //RateInfo
//    @XmlElement(name ="RateInfo")
//    private RateInfoEntity rateInfo;

    @XmlTransient
    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }
    @XmlTransient
    public String getNameChn() {
        return nameChn;
    }

    public void setNameChn(String nameChn) {
        this.nameChn = nameChn;
    }
    @XmlTransient
    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }
    @XmlTransient
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    @XmlTransient
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    @XmlTransient
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    @XmlTransient
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
