package 策略模式应用;

import java.util.Scanner;

public class TestPay {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("您需要支付 95.26 元手机充值费");
        System.out.println("请选择支付方式1:用支付宝支付 2:用快捷方式支付 3:用快捷方式支付 4:用银行借记卡支付");
        int code=scanner.nextInt();

        PayManager pm=null;
        if (code==1){
            pm=new PayManager(new Alipay());
        }
        if (code==2){
            pm=new PayManager(new ShortCut());
        }
        if (code==3){
            pm=new PayManager(new DebitCard());
        }
        pm.doPay(95.26);
    }
}
