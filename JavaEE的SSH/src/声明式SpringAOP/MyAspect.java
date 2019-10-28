package 声明式SpringAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    public  Object invoke(MethodInvocation methodInvocation) throws Throwable{
        System.out.println("方法执行之前");
        Object object=methodInvocation.proceed();
        System.out.println("方法执行之后");
        return object;
    }
}
