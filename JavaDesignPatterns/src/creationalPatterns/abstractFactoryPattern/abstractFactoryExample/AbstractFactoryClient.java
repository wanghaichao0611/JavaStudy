package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


//AbstractFactoryClient：客户端测试类
public class AbstractFactoryClient {
    public static void main(String[] args){
        //使用抽象层定义
        SkinFactory factory;
        Button button;
        TextField textField;
        ComboBox comboBox;
        factory=(SkinFactory) AbstractFactoryXMLUtil.getBean();
        button=factory.createButton();
        textField=factory.createTextField();
        comboBox=factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
