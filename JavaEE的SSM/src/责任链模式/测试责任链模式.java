package 责任链模式;

import JDK动态代理.Helloworld;
import JDK动态代理.HelloworldImpl;
import org.junit.Test;
import 拦截器.InterceptorJdkProxy;

public class 测试责任链模式 {
    @Test
    public void test1()
    {
        Helloworld proxy1=(Helloworld) InterceptorJdkProxy.bind(new HelloworldImpl(),"责任链模式.Interceptor1");
        Helloworld proxy2=(Helloworld) InterceptorJdkProxy.bind(proxy1,"责任链模式.Interceptor2");
        Helloworld proxy3=(Helloworld) InterceptorJdkProxy.bind(proxy2,"责任链模式.Interceptor3");
        proxy3.sayHelloworld();
    }
}
