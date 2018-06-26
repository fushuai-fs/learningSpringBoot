package springBoot.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.service.ClientService;

import java.util.ArrayList;
import java.util.List;

@Controller("customer")
@RequestMapping(value = "customer")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @ResponseBody
    @RequestMapping(value = "/add",method = {RequestMethod.POST})
    public int add(ClientEntity client){

        return clientService.add(client);
    }
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public String getList(ModelMap map)
    {
        List<ClientEntity> clientList =clientService.getList();

        map.addAttribute("list", clientList);

        return "Customer";
    }
}
