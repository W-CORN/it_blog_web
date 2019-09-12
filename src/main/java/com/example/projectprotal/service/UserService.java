package com.example.projectprotal.service;

import com.example.projectprotal.entity.User;

public interface UserService {
  User findByUsername(String username);
}
