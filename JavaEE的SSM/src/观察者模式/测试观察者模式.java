package 观察者模式;

import org.junit.Test;

public class 测试观察者模式 {
    @Test
    public void test()
    {
        ProductList observable=ProductList.getInstance();
        淘宝电商接口 a=new 淘宝电商接口();
        京东电商接口 b=new 京东电商接口();
        observable.addObserver(a);
        observable.addObserver(b);
        observable.addProduct("新增产品1");
    }
}
