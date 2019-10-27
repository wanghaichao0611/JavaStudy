package 第十章输入输出与文件处理;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException
    {
        java.io.FileWriter fw=new java.io.FileWriter("e:\\test.txt");
        char[] c={'M','E'};
        String str="欢迎使用Java!";
        fw.write(c);
        fw.write(str);
        fw.close();
    }
}
