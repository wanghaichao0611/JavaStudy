package 工厂模式应用;
//飞机工厂类
public class FlyFactory {
    public static Fly create(String type){
        Fly fly=null;
        if ("b747".equalsIgnoreCase(type)){
            fly=new B747Fly();
        }else if ("a380".equalsIgnoreCase(type)){
            fly=new A380Fly();
        }
        return fly;
    }
}
