package 第十章输入输出与文件处理;

import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        String thisLine;
        int count=0;
        try{
            FileReader fr=new FileReader("e:\\test.txt");
            java.io.BufferedReader bfr=new java.io.BufferedReader(fr);
            while ((thisLine=bfr.readLine())!=null){
                count++;
                System.out.println(thisLine);
            }
            System.out.println("共读取了"+count+"行");
            bfr.close();
        }
        catch (IOException e){
            System.out.println("错误！"+e);
        }
    }
}
