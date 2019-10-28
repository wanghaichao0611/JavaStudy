package 一个简单的约定游戏;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanUtil implements InvocationHandler {
    public Object obj;
    private Interceptor interceptor=null;
    public static Object getBean(Object obj,Interceptor interceptor)
    {
        ProxyBeanUtil _this=new ProxyBeanUtil();
        _this.obj=obj;
        _this.interceptor=interceptor;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),_this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObj=null;
        //是否产生异常
        boolean exceptionFlag=false;
        //before方法
        interceptor.before(obj);
        try
        {
            //反射原有方法
            retObj=method.invoke(obj,args);
        }
        catch (Exception e){
            exceptionFlag=true;
        }
        finally {
            //after方法
            interceptor.after(obj);
        }
        if (exceptionFlag)
        {
            interceptor.afterReturning(obj);
        }else
        {
            interceptor.afterThrowing(obj);
        }
        return obj;
    }
}
