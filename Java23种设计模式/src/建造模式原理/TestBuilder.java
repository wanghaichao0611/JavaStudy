package 建造模式原理;
//测试
public class TestBuilder {
    public static void main(String[] args){
        Car car=Director.construct(new ConcreteBuilder());
        System.out.println(car.getHead());
        System.out.println(car.getBody());
        System.out.println(car.getFoot());
    }
}
