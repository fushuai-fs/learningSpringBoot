package springBoot.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import springBoot.demo.entity.ClientEntity;
import springBoot.demo.param.ClientParam;
import springBoot.demo.service.ClientService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller("customer")
@RequestMapping(value = "customer")
public class ClientController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true)); 
    }

    @Autowired
    private ClientService clientService;


    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    public String add(RedirectAttributes map, @RequestParam(defaultValue = "") String name
            , @RequestParam(defaultValue = "") Integer gender
            , @RequestParam(defaultValue = "") String mobile) {
        ClientEntity client = new ClientEntity();
        client.setCustomerID(1234567890L);
        client.setFullName(name);
        client.setGender(gender);
        client.setMobile(mobile);
        int i = clientService.add(client);
        if (i == 0) {
            map.addFlashAttribute("error", "添加失败！");
        } else {
            map.addFlashAttribute("error", "添加成功！");
        }
        return "redirect:/customer/list";
    }

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String getList(ModelMap map, @RequestParam(defaultValue = "1") Integer pageNumber
            , @RequestParam(defaultValue = "5") Integer pageSize
            , @RequestParam(defaultValue = "") String name
            , @RequestParam(defaultValue = "0") Long cusID
            , @RequestParam(required = false) Date beginDate
            , @RequestParam(required = false) Date endDate
            , @RequestParam(defaultValue = "") String mobile
            , @RequestParam(defaultValue = "0") Integer type) {

        ClientParam clientParam = new ClientParam();
        clientParam.setPageNumber(pageNumber);
        clientParam.setPageSize(pageSize);
        clientParam.setName(name);
        clientParam.setCusID(cusID);
        clientParam.setBeginDate(beginDate);
        clientParam.setEndDate(endDate);
        clientParam.setMobile(mobile);
        clientParam.setType(type);
        List<ClientEntity> clientList = clientService.getList(clientParam);


        Long count = clientService.getCount(clientParam);
        Long pageTotal = count / pageSize;
        if (count % pageSize > 0) {
            pageTotal += 1;
        }
        clientParam.setPageTotal(pageTotal);

        map.addAttribute("list", clientList);
        map.addAttribute("pageNumber", pageNumber);
        map.addAttribute("pageSize", pageSize);
        map.addAttribute("pageTotal", pageTotal);
        map.addAttribute("pages", clientParam);
        map.addAttribute("url", "/customer/list");

        return "Customer";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(RedirectAttributes map, @PathVariable(name = "id") Long id) {

        if (id <= 0) {
            map.addFlashAttribute("error", "参数错误！");
        } else {
            int i = clientService.delete(id);
            if (i == 0) {
                map.addFlashAttribute("error", "删除失败！");
            } else {
                map.addFlashAttribute("error", "删除成功！");
            }
        }
        return "redirect:/customer/list";
    }
}
