package 适配器模式原理;
//插口实现类 本来功率是 100伏电压
public class BigPlug implements Plug {
    public int recharge(){
        return 100;
    }
}
