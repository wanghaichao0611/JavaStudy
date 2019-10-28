package 策略模式应用;
//快捷支付 策略实现类
public class ShortCut extends Pay {
    @Override
    public void pay(double price) {
        System.out.println("通过快捷方式支付"+price+"元");
    }
}
