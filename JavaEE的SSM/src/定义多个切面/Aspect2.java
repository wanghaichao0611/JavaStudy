package 定义多个切面;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class Aspect2 {
    @Pointcut("execution(* 定义多个切面.MutiBeanImpl.testMulti(..))")
    public void print()
    {
    }
    @Before("print()")
    public void before()
    {
        System.out.println("before 2");
    }
    @After("print()")
    public void after()
    {
        System.out.println("after 2");
    }
    @AfterReturning("print()")
    public void afterReturning()
    {
        System.out.println("afterReturning 2");
    }
    @AfterThrowing("print()")
    public void afterThrowing()
    {
        System.out.println("afterThrowing 2");
    }
}
