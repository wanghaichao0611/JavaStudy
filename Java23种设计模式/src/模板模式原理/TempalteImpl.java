package 模板模式原理;

public class TempalteImpl extends Template {
    @Override
    public void print() {
        super.print();
        System.out.println("设置 A4纸的颜色 红色");//打印模板类的方法，并且可以扩展
    }
}
