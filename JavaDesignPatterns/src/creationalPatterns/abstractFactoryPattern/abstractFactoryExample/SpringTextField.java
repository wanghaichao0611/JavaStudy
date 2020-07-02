package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


//SpringTextField：Spring文本框类，充当具体产品
public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }
}
