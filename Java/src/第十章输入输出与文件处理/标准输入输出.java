package 第十章输入输出与文件处理;
import java.io.*;
public class 标准输入输出
{
    public  static void main(String[] args)
    {
        try
        {
            byte[] b=new byte[128];
            System.out.print("请输入字符:");
            int count=System.in.read(b);
            System.out.println("请输入的是:");
            for(int i=0;i<count;i++)
               System.out.print(b[i]+" ");
            System.out.println();
            for(int i=0;i<count-1;i++)
                System.out.print((char)b[i]+" ");
            System.out.println();
            System.out.println("输入的字符个数为"+count);
            Class InClass=System.in.getClass();
            Class OutClass=System.out.getClass();
            System.out.println("in所在的类是:"+InClass.toString());
            System.out.println("out所在的类是:"+OutClass.toString());
        }
        catch (IOException e){}
    }

}
