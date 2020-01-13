package com.example.controller;

import com.example.entity.FeedBackObject;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public FeedBackObject getUserById(Integer id){
        FeedBackObject fbo = new FeedBackObject();
        User user = userService.getUserById(id);
        fbo.setObj(user);
        return fbo;
    }

    @RequestMapping("/getUserPager")
    @ResponseBody
    public FeedBackObject getUserPager(Integer curPage,Integer pageSize){
        FeedBackObject fbo = new FeedBackObject();
        List<User> list = userService.userPager(curPage,pageSize);
        fbo.setObj(list);
        return fbo;
    }

}
