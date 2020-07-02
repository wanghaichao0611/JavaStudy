package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


//SpringComboBox：Spring组合框类，充当具体产品
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框");
    }
}
