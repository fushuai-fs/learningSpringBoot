package springBoot.demo.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springBoot.demo.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
//@RequestMapping("/Users")
@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> users = new ArrayList<User>();
        return users;
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("你好");
        return user;
    }

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    public Map<String, String> login(@RequestParam String userName, @RequestParam String pwd) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("userName", userName);
        map.put("password", pwd);
        return map;
    }
}
