package 装饰模式原理;
//可以装饰为演员
public class ActorDecorator extends Decorator {
    public ActorDecorator(Person p){
        super(p);
    }

    @Override
    public void show() {
        p.show();
        System.out.println("我是国际演员");
    }
}
