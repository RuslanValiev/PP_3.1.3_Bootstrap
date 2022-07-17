package com.example.pp_3_1_3.service;


import com.example.pp_3_1_3.entity.User;

import java.util.List;

public interface UserService {
     void addUser(User user);
     void deleteUser(Long id);
     void editUser(User user);
     User getUserById(Long id);
     User getUserByEmail(String email);
     List<User> getAllUsers();
}
