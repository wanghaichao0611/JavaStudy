package XML声明式AspectJ;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//切面类,在此编写通知，可以子啊XML配置文件中确定通知类型//
public class MyAspect {
    //前置通知
    public void  myBefore(JoinPoint joinpoint)
    {
        System.out.println("前置通知,目标:");
        System.out.println(joinpoint.getTarget()+",方法名称:");
        System.out.println(joinpoint.getSignature().getName());
    }
    //后置通知//
    public  void myAfterReturning(JoinPoint joinPoint)
    {
        System.out.print("后置通知,方法名称:"+joinPoint.getSignature().getName());
    }
    //环绕通知
    //ProceedingJoinPoint是JoinPoint的子接口，表示可以执行目标方法；
    //1.必须返回Object类型值；
    //2.必须接受一个参数，类型为ProceedingJoinPoint；
    //3.必须throws Threwable；
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        //开始
        System.out.println("环绕开始");
        Object object=proceedingJoinPoint.proceed();
        //结束
        System.out.println("环绕结束");
        return object;
    }
    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint,Throwable throwable)
    {
        System.out.println("异常通知"+"出错了"+throwable.getMessage());
    }
    //最终通知
    public void myAfter()
    {
        System.out.println("最终通知");
    }
}
