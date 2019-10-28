package JDK动态代理;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIB implements MethodInterceptor{
    //生成CGLIB代理对象
    //@param cls--Class类
    //@return Class类的代理对象
    public Object getProxy(Class cls)
    {
        //CGLIB enhancer 增强类对象
        Enhancer enhancer=new Enhancer();
        //设置增强类型
        enhancer.setSuperclass(cls);
        //定义代理逻辑为当前对象，要求当前对象实现MethodInterceptor方法
        enhancer.setCallback(this);
        //生成并返回代理对象
        return enhancer.create();
    }
    /**代理逻辑
     //* @param proxy代理对象
     //* @param method当前调度方法
     //* @param args当前方法参数
     //* @return 代理结果返回
     //* @throws Throwable异常
     //*/
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable
    {
        System.out.println("调度真实对象前");
        //CGLIB反射调用真实对象方法
        Object result=methodProxy.invokeSuper(proxy,args);
        System.out.println("调度真实对象后");
        return result;
    }
}
