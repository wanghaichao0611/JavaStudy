package 策略模式应用;
//银行借记卡支付 策略实现类
public class DebitCard  extends Pay{
    @Override
    public void pay(double price) {
        System.out.println("银行借记卡支付"+price+"元");
    }
}
