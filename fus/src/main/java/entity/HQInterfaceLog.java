///*
//  Author: Administration-PC
//  Date: 2018/10/26 16:20
//  Copyright ： all rights reserved
//*/
//package entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import java.io.Serializable;
//import java.util.Date;
//
//@Entity
//public class HQInterfaceLog implements Serializable {
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue
//    private Long  ID;
//    @Column
//    private boolean IsCache;
//    @Column
//    private String Type;
//    @Column
//    private Long    AvailID;
//    @Column
//    private Long   OrderID;
//    @Column
//    private int       CityID;
//    @Column
//    private Long   HotelID;
//    @Column
//    private int     RoomCount;
//    @Column
//    private int    AdultCount;
//    @Column
//    private String   Request;
//    @Column
//    private String Response;
//    @Column
//    private String  Error;
//
//
//    public Long getID() {
//        return ID;
//    }
//
//    public void setID(Long ID) {
//        this.ID = ID;
//    }
//
//    public boolean isCache() {
//        return IsCache;
//    }
//
//    public void setCache(boolean cache) {
//        IsCache = cache;
//    }
//
//    public String getType() {
//        return Type;
//    }
//
//    public void setType(String type) {
//        Type = type;
//    }
//
//    public Long getAvailID() {
//        return AvailID;
//    }
//
//    public void setAvailID(Long availID) {
//        AvailID = availID;
//    }
//
//    public Long getOrderID() {
//        return OrderID;
//    }
//
//    public void setOrderID(Long orderID) {
//        OrderID = orderID;
//    }
//
//    public int getCityID() {
//        return CityID;
//    }
//
//    public void setCityID(int cityID) {
//        CityID = cityID;
//    }
//
//    public Long getHotelID() {
//        return HotelID;
//    }
//
//    public void setHotelID(Long hotelID) {
//        HotelID = hotelID;
//    }
//
//
//    public int getRoomCount() {
//        return RoomCount;
//    }
//
//    public void setRoomCount(int roomCount) {
//        RoomCount = roomCount;
//    }
//
//    public int getAdultCount() {
//        return AdultCount;
//    }
//
//    public void setAdultCount(int adultCount) {
//        AdultCount = adultCount;
//    }
//
//    public String getRequest() {
//        return Request;
//    }
//
//    public void setRequest(String request) {
//        Request = request;
//    }
//
//    public String getResponse() {
//        return Response;
//    }
//
//    public void setResponse(String response) {
//        Response = response;
//    }
//
//    public String getError() {
//        return Error;
//    }
//
//    public void setError(String error) {
//        Error = error;
//    }
//
//}
