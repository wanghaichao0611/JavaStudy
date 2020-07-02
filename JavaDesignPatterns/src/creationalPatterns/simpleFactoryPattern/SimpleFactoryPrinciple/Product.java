package creationalPatterns.simpleFactoryPattern.SimpleFactoryPrinciple;


public abstract class Product {
    //所有产品类的公共业务方法
    public void methodSame(){
        //公共方法的实现
        System.out.println("实现了公共方法");
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}
