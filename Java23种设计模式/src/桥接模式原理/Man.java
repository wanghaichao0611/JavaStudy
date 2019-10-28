package 桥接模式原理;
//男人
public class Man extends Person {
    public Man(String name){
        super(name);
    }

    @Override
    public void dress() {
        System.out.println(name+"穿"+ clothing.getName());
    }
}
