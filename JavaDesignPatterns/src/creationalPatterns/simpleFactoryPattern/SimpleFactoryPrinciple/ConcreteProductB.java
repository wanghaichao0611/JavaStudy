package creationalPatterns.simpleFactoryPattern.SimpleFactoryPrinciple;

public class ConcreteProductB extends Product {

    //实现业务方法
    @Override
    public void methodDiff() {
        //业务方法的实现
        System.out.println("B实现了业务方法");
    }
}
