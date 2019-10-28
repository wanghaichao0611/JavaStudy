package 拦截器;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {
    @Override//befor方法返回boolean值，她在真实对象前调用。当返回为true时，则反射真实对象的方法：当返回为false时，则调用around方法.
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法前逻辑");
        return false;//不反射被代理对象原有方法
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法后逻辑");
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("取代了被代理对象的方法");
    }
}
