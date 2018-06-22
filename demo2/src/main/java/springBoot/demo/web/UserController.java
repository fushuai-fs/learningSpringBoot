package springBoot.demo.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import springBoot.demo.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("User")
@RequestMapping("/Users")
public class UserController {
    @RequestMapping("/get")
    public String index(ModelMap map) {
        map.addAttribute("message", "http://www.meiyou.com");
        return "index";
    }

}
