package cn.itcast.JDK动态代理;
//切面类：可以存在多个通知Advice（增强的方法内容）
public class MyAspect {
    public void mybefore()
    {
        System.out.println("方法执行前");
    }
    public void myafter()
    {
        System.out.println("方法执行后");
    }
}
