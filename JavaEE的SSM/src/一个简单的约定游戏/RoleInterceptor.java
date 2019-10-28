package 一个简单的约定游戏;

public class RoleInterceptor implements Interceptor {
    @Override
    public void before(Object obj) {
        System.out.println("befor方法执行了");
    }

    @Override
    public void after(Object obj) {
        System.out.println("after方法执行了(必定执行!)");
    }

    @Override
    public void afterReturning(Object obj) {
        System.out.println("afterReturning方法被执行了，没有异常!");
    }

    @Override
    public void afterThrowing(Object obj) {
        System.out.println("afterThrowing方法被执行了，存在异常!");
    }
}
