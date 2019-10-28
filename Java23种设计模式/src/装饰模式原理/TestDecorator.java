package 装饰模式原理;
//测试
public class TestDecorator {
    public static void main(String[] args){
        Person p=new Man();
        p.show();

        p=new ManagerDecorator(p);
        p.show();

        p=new ActorDecorator(p);
        p.show();
    }
}
