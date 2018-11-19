/*
  Author: Administration-PC
  Date: 2018/11/13 10:53 
  Copyright ： all rights reserved  
*/
package com.baitour.mssqlmongo.entity.supplier;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="availabilityResponse")
public class AvailabilityResponseEntity {

    private Long orderID;
    private Long availID;





    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getAvailID() {
        return availID;
    }

    public void setAvailID(Long availID) {
        this.availID = availID;
    }
}
