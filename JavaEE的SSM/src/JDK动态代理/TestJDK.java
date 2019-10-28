package JDK动态代理;

import org.junit.Test;

public class TestJDK {
    @Test
    public void test()
    {
        动态代理的绑定和逻辑实现 jdk=new 动态代理的绑定和逻辑实现();
        //绑定关系,因为挂在接口Helloworld下，所以声明代理对象Helloworld proxy
        Helloworld proxy=(Helloworld)jdk.bind(new HelloworldImpl());
        //注意，此时Helloworld对象已经是一个代理对象，它会进入代理的逻辑方法invoke里
        proxy.sayHelloworld();
    }
}
