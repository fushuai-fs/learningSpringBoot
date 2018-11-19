/*
  Author: Administration-PC
  Date: 2018/11/12 11:40
  Copyright ： all rights reserved
*/
package com.baitour.mssqlmongo.entity.supplier;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Interface_log")
public class InterfaceLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    private Long id;
    @Column(name = "ALong")
    private Long aLong;
    @Column(name = "OrderID")
    private Long orderID;

    @Column(name = "Type")
    private String type;
    @Column(name = "Request")
    private String request;
    @Column(name = "Response")
    private String response;
    @Column(name = "Error")
    private String error;

    @Column(name = "AddTime")
    private Date addTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
