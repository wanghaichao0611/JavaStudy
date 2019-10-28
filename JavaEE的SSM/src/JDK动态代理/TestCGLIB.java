package JDK动态代理;
import java设计模式.reflectServiceImpl;
import org.junit.Test;

public class TestCGLIB {
    @Test
        public void testCglib()
        {
            CGLIB cpe=new CGLIB();
            reflectServiceImpl obj=(reflectServiceImpl)cpe.getProxy(reflectServiceImpl.class);
            obj.sayHello("张三");
        }
    }