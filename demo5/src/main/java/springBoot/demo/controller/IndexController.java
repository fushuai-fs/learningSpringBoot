package springBoot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import springBoot.demo.entity.MenuEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller("Index")
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
/*1	icon-cogs	系统管理
2	icon-group	客户管理
3	 	活动管理
4	icon-globe	积分管理
5		订单管理
6	icon-bar-chart	产品管理*/

        List<MenuEntity> menuEntityList = new ArrayList<>();
        MenuEntity menu = new MenuEntity();
        menu.setID(2);
        menu.setIconName("glyphicon glyphicon-user");
        menu.setMenuName("客户管理");
        menu.setParentID(0);
        menu.setMenuType(1);
        menu.setPageUrl("");
        menuEntityList.add(menu);
        menu = new MenuEntity();
        menu.setID(3);
        menu.setIconName("glyphicon glyphicon-list");
        menu.setMenuName("活动管理");
        menu.setParentID(0);
        menu.setMenuType(1);
        menu.setPageUrl("");
        menuEntityList.add(menu);
        menu = new MenuEntity();
        menu.setID(4);
        menu.setIconName("glyphicon glyphicon-list");
        menu.setMenuName("积分管理");
        menu.setParentID(0);
        menu.setMenuType(1);
        menu.setPageUrl("");
        menuEntityList.add(menu);
        menu = new MenuEntity();
        menu.setID(5);
        menu.setIconName("glyphicon glyphicon-list-alt");
        menu.setMenuName("订单管理");
        menu.setParentID(0);
        menu.setMenuType(1);
        menu.setPageUrl("");
        menuEntityList.add(menu);

        menu = new MenuEntity();
        menu.setID(6);
        menu.setIconName("glyphicon glyphicon-equalizer\n");
        menu.setMenuName("产品管理");
        menu.setParentID(0);
        menu.setMenuType(1);
        menu.setPageUrl("");
        menuEntityList.add(menu);

        menu = new MenuEntity();
        menu.setID(1);
        menu.setIconName("glyphicon glyphicon-inbox");
        menu.setMenuName("系统管理");
        menu.setParentID(0);
        menu.setMenuType(1);
        menu.setPageUrl("");
        menuEntityList.add(menu);
        map.addAttribute("menus", menuEntityList);
        return "Index";
    }


    @ResponseBody
    @RequestMapping(value = "/siderMenuByID", method = {RequestMethod.GET})
    public List<MenuEntity> sideMenu(@RequestParam(defaultValue = "1") int ID) {

        List<MenuEntity> listMenu = new ArrayList<>();

        MenuEntity menu = new MenuEntity();
        menu.setID(101);
        menu.setIconName("glyphicon glyphicon-inbox");
        menu.setMenuName("系统管理");
        menu.setParentID(1);
        menu.setMenuType(1);
        menu.setPageUrl("/system");
        listMenu.add(menu);

        menu = new MenuEntity();
        menu.setID(201);
        menu.setIconName("glyphicon glyphicon-user");
        menu.setMenuName("客户管理");
        menu.setParentID(2);
        menu.setMenuType(1);
        menu.setPageUrl("/customer/list");
        listMenu.add(menu);

        menu = new MenuEntity();
        menu.setID(301);
        menu.setIconName("glyphicon glyphicon-list");
        menu.setMenuName("活动管理");
        menu.setParentID(3);
        menu.setMenuType(1);
        menu.setPageUrl("/activity/list");
        listMenu.add(menu);

        menu = new MenuEntity();
        menu.setID(401);
        menu.setIconName("glyphicon glyphicon-list");
        menu.setMenuName("积分管理");
        menu.setParentID(4);
        menu.setMenuType(1);
        menu.setPageUrl("/integral/list");
        listMenu.add(menu);

        menu = new MenuEntity();
        menu.setID(501);
        menu.setIconName("glyphicon glyphicon-list-alt");
        menu.setMenuName("订单管理");
        menu.setParentID(5);
        menu.setMenuType(1);
        menu.setPageUrl("/order/list");
        listMenu.add(menu);

        menu = new MenuEntity();
        menu.setID(601);
        menu.setIconName("glyphicon glyphicon-equalizer");
        menu.setMenuName("产品管理");
        menu.setParentID(6);
        menu.setMenuType(1);
        menu.setPageUrl("/order/list");
        listMenu.add(menu);

       listMenu =  listMenu.stream().filter(menuEntity -> menuEntity.getParentID()==ID).collect(Collectors.toList());

        return listMenu;
    }


}
