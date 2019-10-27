package 第十章输入输出与文件处理;

import java.io.*;

public class 输入输出字节流 {
    public static void main(String[] args){
        FileInputStream fin;//声明文件字节流输入文件
        FileOutputStream fout;//声明文件字节流输出文件
        char ch;
        int data;
        try{
            fin=new FileInputStream(FileDescriptor.in);//创建文件字节输入流对象
            fout=new FileOutputStream("e:\\myfile.txt");//创建文件子接输出流对象font
            System.out.println("请输入一串字符，并以#结束：");
            while ((ch=(char)fin.read())!='#')
                fout.write(ch);
            fin.close();
            fout.close();
            System.out.println();
            fin=new FileInputStream("e:\\myfile.txt");
            fout=new FileOutputStream(FileDescriptor.out);
            while (fin.available()>0){
                data=fin.read();
                fout.write(data);
            }
            fin.close();
            fout.close();
        }
        catch (FileNotFoundException e){
            System.out.println("文件没找到");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
