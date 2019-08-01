package com.example.demo.entity;

import com.example.demo.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest {
    @Autowired
    private static UserDaoImpl userdaoimpl;
    public static void main(String[] args)
    {
User user=new User();
user.setId(1);
user.setAge(27);
user.setName("aalike");
user.setSex("nan");
userdaoimpl.inserUser(user);
        System.out.println("insert Success");

    }
}
