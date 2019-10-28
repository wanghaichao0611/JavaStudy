package 外观模式原理;
//灯光实现类
public class LightImpl implements Light {
    @Override
    public void flash() {
        System.out.println("闪彩灯");
    }
}
