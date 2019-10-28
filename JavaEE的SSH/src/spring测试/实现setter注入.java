package spring测试;
import spring测试.hello;
public class 实现setter注入 implements two {
    private hello hello;
    public  void setHello(hello hello)
    {
        this.hello=hello;
    }
    public void save2()
    {
        this.hello.save();
        System.out.println("setter方法注入");
    }
}
