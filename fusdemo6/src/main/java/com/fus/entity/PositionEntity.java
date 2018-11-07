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
    private String DeviceID;
    @Field("Longitude")
    private String Longitude;
    @Field("Latitude")
    private String Latitude;
    @Field("Mark")
    private String Mark;
    @Field("date")
    private Date date;
    @Field("GaodeLongitude")
    private String GaodeLongitude;
    @Field("GaodeLatitude")
    private String GaodeLatitude;

    public  PositionEntity(String deviceID,String longitude,String latitude,String gaodeLongitude,String gaodeLatitude,String mark){
        this.DeviceID=deviceID;
        this.Longitude=longitude;
        this.Latitude=latitude;
        this.GaodeLongitude=gaodeLongitude;
        this.GaodeLatitude = gaodeLatitude;
        this.Mark=mark;
        this.date= new Date();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(String deviceID) {
        DeviceID = deviceID;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGaodeLongitude() {
        return GaodeLongitude;
    }

    public void setGaodeLongitude(String gaodeLongitude) {
        GaodeLongitude = gaodeLongitude;
    }

    public String getGaodeLatitude() {
        return GaodeLatitude;
    }

    public void setGaodeLatitude(String gaodeLatitude) {
        GaodeLatitude = gaodeLatitude;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", DeviceID='" + DeviceID + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", Mark='" + Mark + '\'' +
                ", date=" + date +
                ", GaodeLongitude='" + GaodeLongitude + '\'' +
                ", GaodeLatitude='" + GaodeLatitude + '\'' +
                '}';
    }
}
