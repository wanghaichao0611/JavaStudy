package 装饰模式原理;
//可以装饰为经理
public class ManagerDecorator extends Decorator {
    public ManagerDecorator(Person p){
        super(p);
    }

    @Override
    public void show() {
        p.show();
        System.out.println("我还是一个经理");
    }
}
