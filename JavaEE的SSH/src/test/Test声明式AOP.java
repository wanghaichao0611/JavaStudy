package test;

import cn.itcast.JDK动态代理.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test声明式AOP {
    @Test
    public void 测试()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("声明式SpringAOP/声明AOP.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDaoproxy");
        userDao.save();
        userDao.update();
        userDao.delete();
        userDao.find();
    }
}
