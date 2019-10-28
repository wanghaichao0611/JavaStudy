package 模板模式应用;

public class TestSprite {
    public static void main(String[] args){
        Sprite s=new Flane();
        s.setX(100);
        s.setY(300);
        s.draw();

        s=new EnemyFlane();
        s.setX(0);
        s.setY(300);
        s.draw();
    }
}
