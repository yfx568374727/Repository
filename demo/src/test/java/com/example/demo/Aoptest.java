package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.assertj.ApplicationContextAssert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aoptest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/example/demo/applicationContext.xml");
PersonService proxyPersonService=(PersonService) context.getBean("personService");
String returnValue=proxyPersonService.savePerson();
        System.out.println(returnValue);
    }
}
