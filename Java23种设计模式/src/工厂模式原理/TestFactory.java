package 工厂模式原理;
//测试
public class TestFactory {
    public static void  main(String[] args){
        Product p=Factory.create(0);
        System.out.println(p.getName());
        p=Factory.create(1);
        System.out.println(p.getName());
    }
}
