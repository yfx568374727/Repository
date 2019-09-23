package com.example.demo.entity;

import com.example.demo.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserTest {
    @Autowired
    private static UserDaoImpl userdaoimpl;
    public static void main(String[] args) throws ParseException {
Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String date1= simpleDateFormat.format(date);
       Date date2=simpleDateFormat.parse(date1);
        System.out.println("insert Success"+date1);

    }
}
