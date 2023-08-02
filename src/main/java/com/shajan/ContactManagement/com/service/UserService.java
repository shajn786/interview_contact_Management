package com.shajan.ContactManagement.com.service;

import com.shajan.ContactManagement.com.dto.ResponseDto;
import com.shajan.ContactManagement.com.entity.User;

import java.util.List;


public interface UserService {

    ResponseDto addUser(User u);

    ResponseDto deleteUser(int id);

    List<User> allUsers();
}
