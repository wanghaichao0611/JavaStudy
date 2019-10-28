package 模板模式应用;

public class Flane extends Sprite {
    @Override
    public void draw() {
        System.out.println("画一个我方飞机 从屏幕底端出现: x="+this.getX()+",y="+this.getY());
    }
}
