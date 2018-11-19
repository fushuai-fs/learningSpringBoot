/*
  Author: Administration-PC
  Date: 2018/11/08 15:19 
  Copyright ： all rights reserved  
*/
package com.baitour.mssqlmongo.entity.supplier1;


import javax.persistence.*;
import java.util.Date;

@Entity(name = "HInterface_log")
public class InterfaceLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    private Long id;
    @Column(name = "IsCache")
    private boolean isCache;
    @Column(name = "Type")
    private String type;
    @Column(name = "AvailID")
    private Long availID;
    @Column(name = "OrderID")
    private Long orderID;
    @Column(name = "Request")
    private String request;
    @Column(name = "Response")
    private String Response;
    @Column(name = "AddTime",nullable = false)
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

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
