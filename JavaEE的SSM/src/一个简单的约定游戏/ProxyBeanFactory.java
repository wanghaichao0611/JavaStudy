package 一个简单的约定游戏;

public class ProxyBeanFactory {
    public static <T> T getBean(T obj,Interceptor interceptor)
    {
        return (T) ProxyBeanUtil.getBean(obj,interceptor);
    }
}
