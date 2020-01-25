package com.vue.demo.controller;

import com.vue.demo.domain.User;
import com.vue.demo.service.UserServiceImpl;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 控制层实体类
 */
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/user")
    public ModelAndView testDemo(){
        return new ModelAndView("user");
    }

    @RequestMapping("/user/findAll")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/user/findById?")
    @ResponseBody
    public User findById(Integer id){
        return userService.findById(id);
    }
}
