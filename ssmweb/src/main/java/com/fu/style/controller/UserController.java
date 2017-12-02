package com.fu.style.controller;

import com.fu.style.model.User;
import com.fu.style.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService service ;

    @RequestMapping(value = "/find",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String findUserById(){
        User user = service.selectUserById(1);
        return  "{\"result\": "+user.toString()+"}" ;
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String addUser(){
        User user = new User();
        user.setName("提莫");
        user.setPassword("666666");
        int i = service.addUser(user);
        return i == 1 ? "{\"result\":\"成功\"}" : "{\"result\":\"失败\"}";
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String updateUser(){
        User user = new User() ;
        user.setId(1);
        user.setName("一发姐");
        user.setPassword("111111");
        int i = service.updateUser(user);
        return i == 1 ? "{\"result\":\"成功\"}" : "{\"result\":\"失败\"}";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String deleteUser(){
        int i = service.deleteUser(1);
        return i == 1 ? "{\"result\":\"成功\"}" : "{\"result\":\"失败\"}";
    }



}
