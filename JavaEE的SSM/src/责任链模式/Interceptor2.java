package 责任链模式;

import 拦截器.Interceptor;

import java.lang.reflect.Method;

public class Interceptor2 implements Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args)
    {
        System.out.println("【拦截器2】的before方法");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {

    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器2】的after方法");
    }
}
