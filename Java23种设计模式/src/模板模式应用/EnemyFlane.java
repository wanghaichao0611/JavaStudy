package 模板模式应用;
//敌人类飞机
public class EnemyFlane extends Flane {
    @Override
    public void draw() {
        System.out.println("画一个敌人飞机 从屏幕顶部出现: x="+this.getX()+",y="+this.getY());
    }
}
