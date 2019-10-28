package 单例模式应用;
//测试
public class TestConfig {
    public static void main(String[] args){
        System.out.println(Config.getInstance().get("classDriver"));
        System.out.println(Config.getInstance().get("username"));
        System.out.println(Config.getInstance().get("password"));
    }
}
