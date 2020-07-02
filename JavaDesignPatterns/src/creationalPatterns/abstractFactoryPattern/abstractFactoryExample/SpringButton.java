package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


//SpringButton：Spring按钮类，充当具体产品
public class SpringButton implements Button {
    public void display(){
        System.out.println("显示浅绿色按钮");
    }
}
