package com.example.pansDemo.user.service.impl;

import com.example.pansDemo.user.mapper.UserMapper;
import com.example.pansDemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


  @Autowired
  UserMapper userMapper;

}
