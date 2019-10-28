package 工厂模式应用;
//A380型 飞机实现类 能 发射三叉戟导弹
public class A380Fly implements Fly {
    @Override
    public void shoot() {
        System.out.println("发射三叉戟导弹");
    }
}
