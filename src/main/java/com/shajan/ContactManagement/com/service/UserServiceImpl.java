package com.shajan.ContactManagement.com.service;

import com.shajan.ContactManagement.com.dao.UserDao;
import com.shajan.ContactManagement.com.dto.ResponseDto;
import com.shajan.ContactManagement.com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    UserDao userDao;

    ResponseDto message = new ResponseDto();

    @Override
    public ResponseDto addUser(User u) {

        List<User> oneUser ;
        oneUser = userDao.findByMobile(u.getMobile());


      if(u.getName() == "") {

          message.setMessage("Enter the name");

      }
      else if (u.getMobile() == 0)
      {
          message.setMessage("enter the mobile number");
      }
      else if(oneUser.isEmpty() == false || u.getMobile() == 0)
      {
          System.out.println(oneUser);
          message.setMessage("enter different mobile number");
      }
      else
      {
          userDao.save(u);
          message.setMessage("added successfully");
      }
      return message;
    }

    @Override
    public ResponseDto deleteUser(int id) {

        userDao.deleteById(id);
        ResponseDto message = new ResponseDto();
        message.setMessage("deleted successfully");
        return message;
    }

    @Override
    public List<User> allUsers() {

        return userDao.findAll();

    }
}
