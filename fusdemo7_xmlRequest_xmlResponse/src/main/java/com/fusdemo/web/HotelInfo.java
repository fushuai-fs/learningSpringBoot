package com.fusdemo.web;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Hotel")
public class HotelInfo {

    private Integer id;
    private String hotelName;
    private String hotelEnglishName;
    private String address;
    private String telephone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelEnglishName() {
        return hotelEnglishName;
    }

    public void setHotelEnglishName(String hotelEnglishName) {
        this.hotelEnglishName = hotelEnglishName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
