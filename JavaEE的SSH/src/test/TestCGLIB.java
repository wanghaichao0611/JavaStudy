package test;

import CGLIB代理.BookDao;
import CGLIB代理.MyBeanFactory;
import org.junit.Test;

public class TestCGLIB {
    @Test
    public void CGLIB测试()
    {
        BookDao bookDao= MyBeanFactory.getBean();
        bookDao.save();
        bookDao.update();
        bookDao.delete();
        bookDao.find();
    }
}
