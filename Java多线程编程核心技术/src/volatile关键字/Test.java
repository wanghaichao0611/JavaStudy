package volatile关键字;

//测试接口
public class Test {
    public static void main(String[] args){
        a a1=new BImpl();
        a1.see();
        a a2=new AImpl();
        a2.see();
        b b1=new BImpl();
        b1.say();
        b1.see();
    }
}
