package 适配器模式原理;
//测试
public class TestBattery {
    public static void main(String[] args){
        Plug plug=new BigPlug();
        System.out.println(plug.recharge()+" 伏电压过大");

        plug=new AdapterPlug();
        System.out.println("适配器转换成"+plug.recharge()+" 伏电压");
    }
}
