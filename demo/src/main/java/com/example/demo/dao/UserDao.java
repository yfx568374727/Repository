package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
@Service
public class UserDao implements UserDaoImpl {
    private DataSource dataSource;
    public DataSource getDataSource(){
        return dataSource;
    }
    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
    }
    @Override
    public void inserUser(User user) {
String name=user.getName();
Integer age=user.getAge();
String sex=user.getSex();
        Connection conn=null;
        Statement stmt=null;
        try{
            conn=dataSource.getConnection();
            stmt=conn.createStatement();
            stmt.execute("INSERT INTO tb_user(name,age,sex)"+"VALUES ('"+name+"','"+age+"','"+sex+"')");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
