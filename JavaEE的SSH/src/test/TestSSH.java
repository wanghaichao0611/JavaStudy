package test;

import SSH框架整合.UserService;
import SSH框架整合.WhcUserEnitity;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSSH {
    @Test
    public void testSsh()
    {
        WhcUserEnitity whcUserEnitity=new WhcUserEnitity();
        whcUserEnitity.set编号(5);
        whcUserEnitity.set用户名("eric");
        whcUserEnitity.set密码("000");
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("SSH框架整合/SSH.xml");
        UserService userService=(UserService)applicationContext.getBean("userService",UserService.class);
        userService.saveUser(whcUserEnitity);
    }
}
