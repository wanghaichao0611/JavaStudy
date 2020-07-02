package creationalPatterns.simpleFactoryPattern.SimpleFactoryPrinciple;


public class ConcreteProductA  extends Product{

    //实现业务方法
    @Override
    public void methodDiff() {
        System.out.println("产品A实现了业务方法");
    }
}
