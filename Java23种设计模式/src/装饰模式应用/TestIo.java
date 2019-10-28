package 装饰模式应用;


import java.io.*;

/*Java中的IO流就是装饰模式的经典应用,同一份数据，可以装饰成字节流InputStream，也可以装饰成字符流FileReader,
也可以装饰成对象流 ObjectInputStream等等
* */
public class TestIo {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("e:\\chinese.txt");//将文件数据装饰成 字节流
            Reader reader = new InputStreamReader(is);//将字节流转换成字符流
            int l;
            while ((l = reader.read())!= -1) {
                System.out.println((char)l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
