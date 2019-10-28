package test;

import Spring事务管理.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransactionProxyFactoryBean {
    @Test
    public void TestTpfb()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring事务管理/Account.xml");
        AccountService accountService=(AccountService)applicationContext.getBean("accountServiceProxy");
        accountService.transfer("rose","jack",100);
        System.out.println("ok");
    }
}
