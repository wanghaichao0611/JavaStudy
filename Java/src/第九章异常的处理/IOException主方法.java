package 第九章异常的处理;
import java.io.*;
public class IOException主方法 {
    public static void main(String[] args) throws IOException
    {
        String str;
        BufferedReader buf;
        buf=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            try
            {
                System.out.println("请输入字符串:");
                str=buf.readLine();
                if (str.length()>0)
                    break;
                else
                    throw new IOException();
            }
            catch (IOException e)
            {
                System.out.println("必须输入字符串!!");
                continue;
            }
        }
        String s=str.toUpperCase();;
        System.out.println("转换后的字符串为:"+s);
    }
}
