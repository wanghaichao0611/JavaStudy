package 工厂模式应用;
//B747型 飞机实现类 能发射导弹
public class B747Fly implements Fly {
    @Override
    public void shoot() {
        System.out.println("发射导弹");
    }
}
