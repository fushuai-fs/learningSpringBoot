package com.fus.controller;

import com.fus.one.User;
import com.fus.one.UserRepository;
import com.fus.two.Message;
import com.fus.two.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class IndexController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @ResponseBody
    @RequestMapping("/getuser")
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @RequestMapping("/getmsg")
    @ResponseBody
    public List<Message> getMessage() {
        return messageRepository.findAll();
    }

}
