package com.example.demo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

public class Test {
    public Test(){
        System.out.println("默认的无参构造方法执行了");
    }

    public Test(String name){
        System.out.println("姓名:"+name);
    }

    public Test(String name,int age){
        System.out.println(name+"="+age);
    }

    private Test(int age){
        System.out.println("年龄:"+age);
    }

    public void m1() {
        System.out.println("m1");
    }

    public void m2(String name) {
        System.out.println(name);
    }

    public String m3(String name,int age) {
        System.out.println(name+":"+age);
        return "aaa";
    }

    private void m4(Date d) {
        System.out.println(d);
    }

    public static void m5() {
        System.out.println("m5");
    }

    public static void m6(String[] strs) {
        System.out.println(strs.length);
    }

        public static void main(String[] args)
        {


        }

    }


