package 原型模式深克隆;
//深克隆:深克隆 拷贝基本数据类型和对象实例
public class TestDeepClone {
    public static void main(String[] args){
        Prototype p=new Prototype("李阳");
        p.setPerson(new Person(20));
        System.out.println(p.getName()+","+p.getPerson().getAge());

        Prototype p2=(Prototype)p.clone();
        System.out.println(p2.getName()+","+p.getPerson().getAge());

        p2.setName("王浩");
        p2.getPerson().setAge(30);
        System.out.println(p.getName()+","+p.getPerson().getAge());
        System.out.println(p2.getName()+","+p2.getPerson().getAge());
    }
}
