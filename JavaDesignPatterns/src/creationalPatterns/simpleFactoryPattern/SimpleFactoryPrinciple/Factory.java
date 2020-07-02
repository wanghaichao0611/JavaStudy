package creationalPatterns.simpleFactoryPattern.SimpleFactoryPrinciple;


/**
 * 简单工厂模式：定义一个工厂类，它可以根据参数的不同返回不同的实例，被创建的实例都具有共同的父类。（它并不是23个设计模式其一）
 * 由于简单工厂模式中创建实例的方法通常是静态（static）方法，因此简单工厂模式又被称为静态工厂方法模式，它是一种类创建型模式。
 * 1.Factory（工厂角色）：工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；
 * 工厂类可以直接被外部直接调用，创建所需的产品对象；在工厂类中提供了静态的工厂方法，他的返回类型为抽象产品类型Product。
 * 2.Product（抽象产品角色）：它是工厂类创建的所有对象的父类，封装了各种产品对象的公有方法；他的引入将提高系统的灵活性，使得
 * 在工厂类中只需定义一个通用的工厂方法，因为它所有创建的具体产品对象都是其子类对象。
 * 3.ConcreteProduct（具体产品角色）：它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。每一个具体
 * 产品角色集成了抽象产品角色，需要实现抽象产品中声明的抽象方法。
 */
public  class Factory {

    //静态工厂方法
    public static Product getProduct(String arg){
        Product product=null;
        if (arg.equalsIgnoreCase("A")){
            product=new ConcreteProductA();
            //初始化配置product
        }else if (arg.equalsIgnoreCase("B")){
            product=new ConcreteProductB();
            //初始化配置product
        }
        return product;
    }
}
