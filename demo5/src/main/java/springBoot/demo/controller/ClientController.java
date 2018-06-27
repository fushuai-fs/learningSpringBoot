package springBoot.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.service.ClientService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller("customer")
@RequestMapping(value = "customer")
public class ClientController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    private ClientService clientService;

    @ResponseBody
    @RequestMapping(value = "/add",method = {RequestMethod.POST})
    public int add(ClientEntity client){

        return clientService.add(client);
    }
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public String getList(ModelMap map,@RequestParam(defaultValue = "1")Integer pageNumber
            ,@RequestParam(defaultValue = "15")Integer pageSize
            , @RequestParam(defaultValue = "") String name
            , @RequestParam(defaultValue = "0") Long cusID
            , @RequestParam(required = false) Date beginDate
            , @RequestParam(required = false) Date endDate
            , @RequestParam(defaultValue = "") String mobile
            , @RequestParam(defaultValue = "0") Integer type)
    {
        List<ClientEntity> clientList =clientService.getList();

        map.addAttribute("list", clientList);

        return "Customer";
    }
}
