package 拦截器;

import JDK动态代理.Helloworld;
import JDK动态代理.HelloworldImpl;
import org.junit.Test;

public class 测试拦截器 {
    @Test
    public void test()
    {
        Helloworld proxy=(Helloworld) InterceptorJdkProxy.bind(new HelloworldImpl(),"拦截器.MyInterceptor");
        proxy.sayHelloworld();
    }
}
