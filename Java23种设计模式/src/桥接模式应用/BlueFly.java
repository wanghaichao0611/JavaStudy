package 桥接模式应用;
//蓝色飞机
public class BlueFly  extends Fly{
    public BlueFly(String name){
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(name+"发射"+bullet.getType());
    }
}
