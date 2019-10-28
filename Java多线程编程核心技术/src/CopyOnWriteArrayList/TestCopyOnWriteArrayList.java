package CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//CopyWriteArrayList和Vector区别是get没有加锁,并且add是创建新的结合再指向旧的集合
public class TestCopyOnWriteArrayList {
    public static void main(String[] args){
        final CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();

        //一个线程的添加
        Thread threadAdd = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    list.add("文章" + i);
                }
            };
        };threadAdd.start();

        //一个线程的读取
        Thread threadRead = new Thread() {
            @Override
            public void run() {
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String data = iterator.next();
                    System.out.println(data);
                }
            };
        };
        threadRead.start();

        //一个线程的删除
        Thread threadDelete = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < list.size(); i++) {
                    list.remove(i);
                }
            };
        };threadDelete.start();
    }
}
