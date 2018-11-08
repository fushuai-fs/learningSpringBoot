/*
  Author: Administration-PC
  Date: 2018/11/07 15:54 
  Copyright ： all rights reserved  
*/
package com.fus.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "Position")
public class PositionEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @Id
    private String id;
    @Field("DeviceID")
    private String deviceID;
    @Field("Longitude")
    private String longitude;
    @Field("Latitude")
    private String latitude;
    @Field("Mark")
    private String mark;
    @Field("Date")
    private Date date;
    @Field("GaodeLongitude")
    private String gaodeLongitude;
    @Field("GaodeLatitude")
    private String gaodeLatitude;

    public  PositionEntity(String deviceID,String longitude,String latitude,String gaodeLongitude,String gaodeLatitude,String mark){
        this.deviceID =deviceID;
        this.longitude =longitude;
        this.latitude =latitude;
        this.gaodeLongitude=gaodeLongitude;
        this.gaodeLatitude = gaodeLatitude;
        this.mark =mark;
        this.date= new Date();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceID() {
        return this.deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGaodeLongitude() {
        return this.gaodeLongitude;
    }

    public void setGaodeLongitude(String gaodeLongitude) {
        this.gaodeLongitude = gaodeLongitude;
    }

    public String getGaodeLatitude() {
        return this.gaodeLatitude;
    }

    public void setGaodeLatitude(String gaodeLatitude) {
        this.gaodeLatitude = gaodeLatitude;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", deviceID='" + deviceID + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", mark='" + mark + '\'' +
                ", date=" + date +
                ", gaodeLongitude='" + gaodeLongitude + '\'' +
                ", gaodeLatitude='" + gaodeLatitude + '\'' +
                '}';
    }
}
