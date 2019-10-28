package 工厂模式应用;
//测试
public class TestFactory {
    public static void main(String[] args) {
        //创建一个 B747
        Fly fly = FlyFactory.create("b747");
        fly.shoot();

        //创建一个 A380
        Fly fly1=FlyFactory.create("a380");
        fly1.shoot();
    }
}