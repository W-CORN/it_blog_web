package com.example.projectprotal.controller;

import com.example.projectprotal.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

 @RequestMapping(value = "/login", method = RequestMethod.GET)
 public String login() {
  return "login";
 }

 @RequestMapping("/")
 public String root() {
  return "index";
 }

 public User getUser() { //为了session从获取用户信息,可以配置如下
  User user = new User();
  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
  if (auth.getPrincipal() instanceof UserDetails) user = (User) auth.getPrincipal();
  return user;
 }

 public HttpServletRequest getRequest() {
  return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
 }
}