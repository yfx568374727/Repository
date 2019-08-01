package com.example.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Demo2 {
    public void test() {
        Class clazz= null;
        try {
            clazz = Class.forName("com.example.demo.Test");
            Constructor constructor=clazz.getConstructor(String.class,int.class);
            constructor.newInstance("like",27);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public void test1() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        try {
            Class clazz=Class.forName("com.example.demo.Test");
            Test t=(Test) clazz.newInstance();
            Method m=clazz.getMethod("m1",null);
            m.invoke(t,null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void m4(Date d) {
        System.out.println(d);
    }
    public void test4() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
       String classname=this.getClass().getName();
        System.out.println("class名称是"+classname);
        Class clazz=Class.forName(classname);
        Demo2 t=(Demo2) clazz.newInstance();
        Method m=clazz.getDeclaredMethod("m4",Date.class);
        m.setAccessible(true);
        m.invoke(t,new Date());

    }
    public void test6() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz=Test.class;
        Test t=(Test)clazz.newInstance();
        Method m=clazz.getMethod("m6", String[].class);
        //m.setAccessible(true);
        m.invoke(t,(Object) new String[]{"a","bc"});


    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
       Demo2 d=new Demo2();
       d.test4();

    }
}
