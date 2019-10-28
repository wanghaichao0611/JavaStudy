package 原型模式浅克隆;
//原型
public class Prototype implements Cloneable{
    private String name;
    public Prototype(String name){
        super();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype p=null;
        try{
            p=(Prototype)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
