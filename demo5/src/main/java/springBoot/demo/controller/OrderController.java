package springBoot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("Order")
@RequestMapping("/Order")
public class OrderController {


    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    public String save(RedirectAttributes map)
    {
        return "";
    }

    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.GET})
    public String delete(@PathVariable(name="id") Long id , RedirectAttributes map)
    {
        return "";
    }
    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    public String update(RedirectAttributes map)
    {
        return "";
    }

    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public String getList(ModelMap map)
    {
        return "";
    }

}
