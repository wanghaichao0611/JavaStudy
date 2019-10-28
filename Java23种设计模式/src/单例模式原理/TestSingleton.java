package 单例模式原理;
//测试
public class TestSingleton {
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        //打印出两个实例的地址一样，引用同样的地址
        System.out.println(s1);
        System.out.println(s2);
    }
}
