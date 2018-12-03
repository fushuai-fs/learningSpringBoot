/*
  Author: Administration-PC
  Date: 2018/12/03 17:33 
  Copyright ： all rights reserved  
*/
package com.fusdemo.entity;

import com.fusdemo.entity.fz.PaxRoom;

import java.util.List;

public class HotelListRequest {
    private String checkIn;
    private String checkOut;
    private String cityCode;
    private List<PaxRoom> paxRooms;

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public List<PaxRoom> getPaxRooms() {
        return paxRooms;
    }

    public void setPaxRooms(List<PaxRoom> paxRooms) {
        this.paxRooms = paxRooms;
    }
}
