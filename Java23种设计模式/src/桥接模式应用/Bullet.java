package 桥接模式应用;


//不同的飞机发射不同的子弹
public abstract class Bullet {
    private String type;
    public Bullet(String type){
        super();
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
