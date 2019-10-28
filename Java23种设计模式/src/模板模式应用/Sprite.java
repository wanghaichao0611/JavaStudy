package 模板模式应用;
//飞机游戏，选择不同的飞机 都具有飞机特性 行为不一样
public abstract class Sprite {
    private int x,y;//飞机x,y坐标
    public abstract void draw();//将飞机画在屏幕上

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
