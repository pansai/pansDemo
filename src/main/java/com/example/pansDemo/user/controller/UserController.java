package com.example.pansDemo.user.controller;

import com.example.pansDemo.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@Api(value="/user", description="test-first", position = 1)
public class UserController {
    @Autowired
    UserService userServer;

    @RequestMapping("/toInfo")
    @ApiOperation(value = "toInfo-Test", httpMethod = "GET", notes = "toInfo-Test", position = 5)
    public String test(HashMap<String, Object> map, Model model){
      model.addAttribute("say","欢迎欢迎,热烈欢迎");
      map.put("hello", "欢迎进入HTML页面");
      return "index";
    }
}
