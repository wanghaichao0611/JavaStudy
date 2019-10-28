package test;

import cn.itcast.JDK动态代理.MyBeanFactory;
import cn.itcast.JDK动态代理.UserDao;
import org.junit.Test;

public class TestJDK {
    @Test
    public void JDK()
    {
        UserDao userDao= MyBeanFactory.getBean();
        userDao.save();
        userDao.update();
        userDao.delete();
        userDao.find();
    }
}
