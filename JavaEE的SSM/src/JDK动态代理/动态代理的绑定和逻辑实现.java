package JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class 动态代理的绑定和逻辑实现 implements InvocationHandler {
    //真实对象
    private Object target=null;
    //建立代理对象和真实对象的代理关系，并返回代理对象
    //@param target 真实对象
    //@return 代理对象
    public Object bind(Object target)
    {
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    /**代理逻辑
     //* @param proxy代理对象
     //* @param method当前调度方法
     //* @param args当前方法参数
     //* @return 代理结果返回
     //* @throws Throwable异常
     //*/
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable
    {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之间的服务");
        Object obj=method.invoke(target,args);//相当于调用sayHelloWorldfan方法
        System.out.println("在调度真实对象之后的服务");
        return obj;
    }
}
