package cn.itcast.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    public static UserDao getBean() {
        final UserDao userDao = new UserDaoImpl();
        final MyAspect myAspect = new MyAspect();
        return (UserDao) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), new Class[]{UserDao.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                myAspect.mybefore();//前增强;
                Object object = method.invoke(userDao, args);//目标类的方式;
                myAspect.myafter();//后增强;
                return object;
            }
        });
    }
}
