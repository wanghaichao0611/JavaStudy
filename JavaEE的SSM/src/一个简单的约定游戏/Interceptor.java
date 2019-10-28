package 一个简单的约定游戏;

public interface Interceptor {
    public void before(Object obj);
    public void after(Object obj);
    public void afterReturning(Object obj);
    public void afterThrowing(Object obj);
}
