package test;

import cn.itcast.JDK动态代理.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/cn/itcast/Annotation的AspectJ/AnnotationAspectJ.xml")
public class Test的声明式An的AspectJ {
    @Autowired()
    private UserDao userDao;
    @Test
    public void TestAnnotationAspect()
    {
        userDao.save();
    }
}
