package 单例模式原理;
//单例模式:保证一个类仅有一个实例，并提供一个访问它的全局访问点
public class Singleton {
    private static Singleton instance;//静态实例
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();//保证只有一个实例
        }
        return instance;
    }
}
