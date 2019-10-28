package CGLIB代理;

import cn.itcast.JDK动态代理.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyBeanFactory {
    public  static BookDao getBean()
    {
        //1.准备目标类（Spring创建对象，Ioc）
        final  BookDao bookDao=new BookDao();
        //2.创建切面类实例；
        final MyAspect myAspect=new MyAspect();
        //3.生成代理类，CGLIB在运行时，生成指定对象的子类，增强
        //3.1 核心类
        Enhancer enhancer=new Enhancer();
        //3.2需要增强的类
        enhancer.setSuperclass(bookDao.getClass());
        //3.3添加回调函数
        enhancer.setCallback(new MethodInterceptor() {
            //intercept相当于JDK invoke，前三个参数与JDK invoke一致；
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                myAspect.mybefore();
                Object object=method.invoke(bookDao,args);
                myAspect.myafter();
                return object;
            }
        });
        //3.4创建代理类
        BookDao bookDao1=(BookDao)enhancer.create();
        return bookDao1;
    }
}
