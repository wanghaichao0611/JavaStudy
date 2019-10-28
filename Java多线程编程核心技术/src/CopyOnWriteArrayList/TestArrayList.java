package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//并发集合CopyWriteArrayList:多线程环境下 写加锁，读不加锁，并发结合.
//1.例子:3个线程 添加线程，读取线程和删除线程 同时操作集合ArrayList
//多次运行发现异常，因为ArrayList是线程不安全的
public class TestArrayList {
    public static void main(String[] args){
        final List<String> list=new ArrayList<String>();

        //一个线程的添加
        Thread threadAdd=new Thread(){
            @Override
            public void run() {
                for (int i=1;i<=10;i++){
                    list.add("文章"+i);
                }
            };
        };threadAdd.start();

        //一个线程的读取
        Thread threadRead=new Thread(){
            @Override
            public void run() {
                Iterator<String> iterator=list.iterator();
                while (iterator.hasNext()){
                    String data=iterator.next();
                    System.out.println(data);
                }
            };
        };threadRead.start();

        //一个线程的删除
        Thread threadDelete=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<list.size();i++){
                    list.remove(i);
                }
            };
        };threadDelete.start();
    }
}
