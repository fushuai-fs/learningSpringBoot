package springBoot.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import springBoot.demo.entity.ActivityEntity;
import springBoot.demo.param.ActivityParam;
import springBoot.demo.service.ActivityService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller("Activity")
@RequestMapping(value = "/Activity")
public class ActivityController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public String save(RedirectAttributes map) {
        return "";
    }

    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public String delete(@PathVariable(name = "id") Long id, RedirectAttributes map) {
        return "";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public String update(RedirectAttributes map) {
        return "";
    }

//    @RequestMapping(value = "/list", method = {RequestMethod.GET})
//    public String getList(ActivityParam param, ModelMap map) {
//
//      List<ActivityEntity> list = activityService.getList(param);
//        Long count = activityService.getCount(param);
//        Long pageTotal = count / param.getPageSize();
//        if (count % param.getPageSize() > 0) {
//            pageTotal += 1;
//        }
//        param.setPageTotal(pageTotal);
//
//        map.addAttribute("list", list);
//        map.addAttribute("pageNumber", param.getPageNumber());
//        map.addAttribute("pageSize", param.getPageSize());
//        map.addAttribute("pageTotal", pageTotal);
//        map.addAttribute("pages", param);
//        map.addAttribute("url", "/Activity/list");
//
//        return "Activity";
//    }

}
