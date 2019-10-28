package 桥接模式应用;
//飞机抽象类
public abstract class Fly {
    protected String name;
    protected Bullet bullet;
    public Fly(String name){
        super();
        this.name=name;
    }
    public abstract void shoot();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
