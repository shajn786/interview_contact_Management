package com.shajan.ContactManagement.com.controller;


import com.shajan.ContactManagement.com.dto.ResponseDto;
import com.shajan.ContactManagement.com.entity.User;
import com.shajan.ContactManagement.com.service.UserService;
import com.shajan.ContactManagement.com.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCotroller {

   @Autowired
    UserService userService;

    @RequestMapping(value = "adduser", consumes = "application/json",produces = "application/json")
    public ResponseDto addUser(@RequestBody User user)
    {

            return userService.addUser(user);

    }

    @RequestMapping(value = "deleteuser",consumes = "application/json", produces = "application/json")
    public ResponseDto deleteUser(@RequestBody User u)
    {
        System.out.println(u.getId());
       return  userService.deleteUser(u.getId());

    }


    @RequestMapping("alluser")
    public List<User> allUserd()
    {

        return userService.allUsers();
    }

}
