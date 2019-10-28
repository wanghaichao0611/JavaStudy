package test;

import Spring事务管理.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAOPXML {
    @Test
    public void Tsetaopxml()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring事务管理/SpringAOPXML方式.xml");
        AccountService accountService=(AccountService)applicationContext.getBean("accountService");
        accountService.transfer("jack","rose",100);
        System.out.println("OK!!!");
    }
}
