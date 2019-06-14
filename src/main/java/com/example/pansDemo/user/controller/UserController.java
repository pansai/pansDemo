package com.example.pansDemo.user.controller;

import com.example.pansDemo.user.service.UserService;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userServer;

    @RequestMapping("/toInfo")
    public String test(HashMap<String, Object> map, Model model){
      model.addAttribute("say","欢迎欢迎,热烈欢迎");
      map.put("hello", "欢迎进入HTML页面");
      return "index";
    }
}
