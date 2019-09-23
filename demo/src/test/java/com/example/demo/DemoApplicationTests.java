package com.example.demo;

import com.example.demo.jpaEntity.Account;
import com.example.demo.yfx.FirstDy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.demo.responsibility.AccountResponsibility;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
public class DemoApplicationTests {
    @Autowired
private AccountResponsibility accountResponsibility;
    @Test
    public void contextLoads() {
Account a=accountResponsibility.findByName("like");
        System.out.println("jpa简单实现"+a.toString());
    }
    @Test
    public void yfx(){
       FirstDy firstDy=new FirstDy();
       int[]g={400,500,200,300,350};
       int[]p={5,5,3,4,3};
       int a=firstDy.getMostGold(10,10,g,p);
        System.out.println("最大收益"+a);
    }
}
