package CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.Vector;

//Vector在多线程环境下是线程安全的 替换 ArrayList,读取和修改都要加锁，高并发环境效率比较低一点
public class TestVector {
    public static void main(String[] args) {
        final Vector<String> list = new Vector<String>();

        //一个线程的添加
        Thread threadAdd = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    list.add("文章" + i);
                }
            }

            ;
        };
        threadAdd.start();

        //一个线程的读取（get不是Inerator）
        Thread threadRead = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < list.size(); i++) {
                    String data=list.get(i);
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