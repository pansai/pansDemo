package com.example.pansDemo.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHello {

  @RequestMapping(value = "/hello")
  @ResponseBody
  public String hello() {
    return "hello spring boot";
  }

}
