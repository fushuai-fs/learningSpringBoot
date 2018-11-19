/*
  Author: Administration-PC
  Date: 2018/11/08 14:37 
  Copyright ： all rights reserved  
*/
package com.baitour.mssqlmongo.entity.supplier1;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Document(collection = "interfaceLogHotel")
@XmlRootElement(name = "HotelResponse")
public class HotelResponseEntity {

    private Long orderID;
    private Long availID;


    //ResponseType
   @XmlElement(name = "ResponseType")
    private String responseType ;
    //Code
    @XmlElement(name ="Code")
            private int code ;
    //SubCode
    @XmlElement(name ="SubCode")
    private int subCode ;
    //Msg
    @XmlElement(name ="Msg")
    private String msg ;
    //CityID
    @XmlElement(name ="CityID")
    private int cityID ;
    //CheckInDate
    @XmlElement(name ="CheckInDate")
    private String checkInDate ;
    //CheckOutDate
    @XmlElement(name ="CheckOutDate")
    private String checkOutDate ;

    //Hotel
    @XmlElement(name ="Hotel")
    private HotelResEntity hotel;

    @XmlTransient
    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }
    @XmlTransient
    public Long getAvailID() {
        return availID;
    }

    public void setAvailID(Long availID) {
        this.availID = availID;
    }

    @XmlTransient
    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
    @XmlTransient
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    @XmlTransient
    public int getSubCode() {
        return subCode;
    }

    public void setSubCode(int subCode) {
        this.subCode = subCode;
    }
    @XmlTransient
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    @XmlTransient
    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
    @XmlTransient
    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }
    @XmlTransient
    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    @XmlTransient
    public HotelResEntity getHotel() {
        return hotel;
    }

    public void setHotel(HotelResEntity hotel) {
        this.hotel = hotel;
    }
}
