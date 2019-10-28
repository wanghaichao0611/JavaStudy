package 桥接模式原理;
//人类
public abstract class Person {
    protected String name;
    protected  Clothing clothing;
    public Person(String name){
        super();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }
    public abstract void dress();
}
