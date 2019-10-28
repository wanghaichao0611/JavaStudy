package test;

import cn.itcast.JDK动态代理.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML的AspectJ {
    @Test
    public void XML的Aspect的方法()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("XML声明式AspectJ/XML的AspectJ.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        userDao.save();

    }
}
