/*
    CreateUser:fus
    CreateDate: 2018-12-02 10:58:32
*/
package com.fusdemo.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 请求必须指定 Content-Type ：application/xml
 */
@Controller
@RequestMapping(value = "/hotel")
public class HotelController {


    @PostMapping(value = "/add"
            ,consumes = MediaType.APPLICATION_XML_VALUE
            , produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public HotelInfo add(@RequestBody HotelInfo hotelInfo) {

        hotelInfo.setAddress("xxxxxxxxxxxxxxxxxxxxxx");
        hotelInfo.setTelephone("120");

        return hotelInfo;
    }

    @RequestMapping(value = "/"
    ,consumes = MediaType.APPLICATION_XML_VALUE
    ,produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public HotelInfo get() {
        HotelInfo hotelInfo = new HotelInfo();
        hotelInfo.setId(100);
        hotelInfo.setHotelName("bb酒店");
        hotelInfo.setHotelEnglishName("bb hotel");
        hotelInfo.setAddress("xxx123456789");
        hotelInfo.setTelephone("110");

        return hotelInfo;
    }
}
