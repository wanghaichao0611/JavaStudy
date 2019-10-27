package 第十章输入输出与文件处理;
import java.io.*;
public class 数据输入输出
{
    public static void main(String[] args)
    {
        FileOutputStream fou;
        DataOutputStream dou;
        FileInputStream fin;
        DataInputStream din;
        try
        {
            fou=new FileOutputStream("e:\\temp");
            dou= new DataOutputStream(fou);
            dou.writeInt(10);
            dou.writeLong(12345);
            dou.writeFloat(3.1415926f);
            dou.writeDouble(987654321.123);
            dou.writeBoolean(true);
            dou.writeChars("Goodbye!");
            dou.close();
        }
        catch(IOException e) {}
        try
        {
            fin=new FileInputStream("e:\\temp");
            din=new DataInputStream(fin);
            System.out.println(din.readInt());
            System.out.println(din.readLong());
            System.out.println(din.readFloat());
            System.out.println(din.readDouble());
            System.out.println(din.readBoolean());
            char ch;
            while((ch=din.readChar())!='\0')
                System.out.println(ch);
            din.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件为找到!");
        }
        catch (IOException e) {}
    }
}