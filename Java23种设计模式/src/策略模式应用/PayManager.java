package 策略模式应用;
//支付管理类
public class PayManager {
    private Pay pay;
    public PayManager(Pay pay){
        this.pay=pay;
    }
    public void doPay(double price){
        pay.pay(price);
    }
}
