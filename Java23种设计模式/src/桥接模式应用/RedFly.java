package 桥接模式应用;
//红色飞机
public class RedFly extends Fly {
    public RedFly(String name){
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(name+"发射"+bullet.getType());
    }
}