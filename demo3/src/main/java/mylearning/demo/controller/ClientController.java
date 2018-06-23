package mylearning.demo.controller;


import mylearning.demo.entity.ClientEntity;
import mylearning.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/add",method = {RequestMethod.POST})
    public int add(ClientEntity client){

        return clientService.add(client);
    }
    @RequestMapping(name ="/" ,method = {RequestMethod.GET})
    public  List<ClientEntity> getList()
    {
        List<ClientEntity> clientList = new ArrayList<ClientEntity>();
        return clientList;
    }
}
