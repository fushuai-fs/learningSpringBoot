/*
  Author: Administration-PC
  Date: 2018/10/26 16:20
  Copyright ： all rights reserved
*/
package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "HQ_Interface_Log")
public class HQInterfaceLog implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "IsCache")
    private boolean isCache;
    @Column(name = "Type")
    private String type;
    @Column(name = "AvailID")
    private Long availID;
    @Column(name = "OrderID")
    private Long orderID;
    @Column(name = "CityID")
    private int cityID;
    @Column(name = "HotelID")
    private Long hotelID;
    @Column(name = "RoomCount")
    private int roomCount;
    @Column(name = "AdultCount")
    private int adultCount;
    @Column(name = "Request")
    private String request;
    @Column(name = "Response")
    private String response;
    @Column(name = "Error")
    private String error;

    @Column(name = "CheckIn")
    private Date checkIn;
    @Column(name = "CheckOut")
    private Date checkOut;
    @Column(name = "AddTime")
    private Date addTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCache() {
        return isCache;
    }

    public void setCache(boolean cache) {
        isCache = cache;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAvailID() {
        return availID;
    }

    public void setAvailID(Long availID) {
        this.availID = availID;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public Long getHotelID() {
        return hotelID;
    }

    public void setHotelID(Long hotelID) {
        this.hotelID = hotelID;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(int adultCount) {
        this.adultCount = adultCount;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
