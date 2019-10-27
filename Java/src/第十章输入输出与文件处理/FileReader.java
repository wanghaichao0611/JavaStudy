package 第十章输入输出与文件处理;

public class FileReader {
    public static void main(String[] args) throws Exception{
        char[] c=new char[500];
        java.io.FileReader fr=new java.io.FileReader("e:\\test.txt");
        int num=fr.read(c);
        String str=new String(c,0,num);
        System.out.println("读取字符个数为："+num+",其内容如下:");
        System.out.println(str);
        fr.close();
    }
}
