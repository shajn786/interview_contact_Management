package com.shajan.ContactManagement.com.dao;

import com.shajan.ContactManagement.com.dto.ResponseDto;
import com.shajan.ContactManagement.com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    List<User> findByMobile(long mobile);

}
