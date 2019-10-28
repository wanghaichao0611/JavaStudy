package 适配器模式原理;
//BigPlug 100伏电压过大，适配器重新减少电压 到 36伏安全电压
public class AdapterPlug implements Plug {
    @Override
    public int recharge() {
        BigPlug bigPlug=new BigPlug();
        int v=bigPlug.recharge();
        v=v-64;
        return v;
    }
}
