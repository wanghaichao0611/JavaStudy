package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


//SummerTextField：Summer文本框类，充当具体产品
public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}
