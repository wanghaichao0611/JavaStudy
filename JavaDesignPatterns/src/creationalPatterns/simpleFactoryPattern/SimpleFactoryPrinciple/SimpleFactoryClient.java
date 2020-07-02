package creationalPatterns.simpleFactoryPattern.SimpleFactoryPrinciple;


public class SimpleFactoryClient {
    public static void main(String[] args){
        Product product;
        //通过工厂类创建产品对象
        product=Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}
