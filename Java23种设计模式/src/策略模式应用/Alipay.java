package 策略模式应用;
//支付宝支付 策略实现类
public class Alipay  extends Pay{
    @Override
    public void pay(double price) {
        System.out.println("通过支付宝支付"+price+"元");
    }
}
