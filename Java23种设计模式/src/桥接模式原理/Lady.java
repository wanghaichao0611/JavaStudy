package 桥接模式原理;

public class Lady extends Person {
    public Lady(String name){
        super(name);
    }

    @Override
    public void dress() {
        System.out.println(name+"穿"+clothing.getName());
    }
}
