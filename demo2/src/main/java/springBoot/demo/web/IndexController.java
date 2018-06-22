package springBoot.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springBoot.demo.domain.Menu;

import java.util.ArrayList;
import java.util.List;

@Controller("Index")

@RequestMapping("/Index")
public class IndexController {

    @RequestMapping(name = "/",method= RequestMethod.GET)
    public String index(ModelMap map){
/*1	icon-cogs	系统管理
2	icon-group	客户管理
3	NULL	运营管理
4	icon-globe	酒店管理
5		订单管理
6	icon-bar-chart	财务管理*/
        List<Menu> listMenu = new ArrayList<>();
        Menu menu = new Menu();
        menu.setID(1);menu.setIconName("glyphicon glyphicon-inbox");menu.setMenuName("系统管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("");
        listMenu.add(menu);
        menu = new Menu();
        menu.setID(2);menu.setIconName("glyphicon glyphicon-user");menu.setMenuName("客户管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("");
        listMenu.add(menu);
        menu = new Menu();
        menu.setID(3);menu.setIconName("glyphicon glyphicon-list");menu.setMenuName("运营管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("");
        listMenu.add(menu);
        menu = new Menu();
        menu.setID(4);menu.setIconName("glyphicon glyphicon-list");menu.setMenuName("酒店管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("");
        listMenu.add(menu);
        menu = new Menu();
        menu.setID(5);menu.setIconName("glyphicon glyphicon-list-alt");menu.setMenuName("订单管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("");
        listMenu.add(menu);
        menu = new Menu();
        menu.setID(6);menu.setIconName("glyphicon glyphicon-equalizer\n");menu.setMenuName("财务管理");menu.setParentID(0);menu.setMenuType(1);menu.setPageUrl("");
        listMenu.add(menu);
        //  map.addAttribute 4种形式需要学习！！！！！！！！！！！
        map.addAttribute("menus",listMenu);
        return  "index";
    }

}
