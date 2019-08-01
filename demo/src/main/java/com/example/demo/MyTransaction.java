package com.example.demo;

public class MyTransaction {
    //切面里的通知方法
    public void beginTransction(){
        System.out.println("开启事务");
    }
    public void commit(){
        System.out.println("提交事务");
    }
}
