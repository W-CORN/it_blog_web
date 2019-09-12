package com.example.projectprotal.service.impl;

import com.example.projectprotal.dao.UserMapper;
import com.example.projectprotal.entity.User;
import com.example.projectprotal.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

 @Resource
 private UserMapper userMapper;
 /**
  * 根据用户名查询用户
  * @param username
  * @return
  */
 @Override
 public User findByUsername(String username) {
  return userMapper.findUserByUsername(username);
 }
}
