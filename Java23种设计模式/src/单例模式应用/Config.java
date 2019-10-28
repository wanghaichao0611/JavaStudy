package 单例模式应用;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//数据库的参数配置
public class Config {
    private static Config config;
    private static Properties p=null;
    public Config(){
        try{
            if (p==null){
                p=new Properties();
                InputStream is=this.getClass().getResourceAsStream("/config.properties");
                p.load(is);//加载config.properties配置文件
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Config getInstance(){
        if (config==null){
            config=new Config();//保证只有一个实例
        }
        return config;
    }
    //通过key获得config.properties对应的值
    public static String get(String key){
        return p.getProperty(key);
    }
}
