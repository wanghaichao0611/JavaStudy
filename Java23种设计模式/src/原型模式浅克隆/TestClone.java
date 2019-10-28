package 原型模式浅克隆;
//浅克隆 只拷贝基本数据类型
public class TestClone {
    public static void main(String[] args) throws Exception{
        Prototype p=new Prototype("李阳");
        System.out.println(p.getName());

        Prototype p2=(Prototype)p.clone();
        System.out.println(p2.getName());

        p2.setName("王浩");
        System.out.println(p2.getName());
        System.out.println(p.getName());
    }
}
