package 模板模式原理;
//模板模式:定义一个操作的算法的骨架，而将一些步骤延迟到子类中实现
public abstract class Template {
    public void print(){
        System.out.println("打印A4纸");
    }
}
