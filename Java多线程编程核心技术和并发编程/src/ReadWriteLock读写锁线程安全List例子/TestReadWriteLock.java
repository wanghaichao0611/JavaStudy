package ReadWriteLock读写锁线程安全List例子;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//线程安全的ArrayList
class SynchronizedList<T>{
    private final ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private final Lock readLock=readWriteLock.readLock();
    private final Lock writeLock=readWriteLock.writeLock();
    private final List<T> list=new ArrayList<T>();
    public void add(T o){
        writeLock.lock();
        try{
            list.add(o);
        }finally {
            writeLock.unlock();
        }
    }
    public T get(int i){
        readLock.lock();
        try{
            return list.get(i);
        }finally {
            readLock.unlock();
        }
    }
    public int size(){
        return list.size();
    }
}
public class TestReadWriteLock {
    public static void main(String[] args){
        final SynchronizedList<String> list=new SynchronizedList<String>();
        //list添加数据
        for (int i=1;i<5;i++){
            list.add("数据"+i);
        }
        //开启多个线程list读取数据
        System.out.println("");
        System.out.println("读取数据:");
        for (int i=1;i<=2;i++){
            Thread thread=new Thread("线程 "+i){
                @Override
                public void run() {
                    for (int j=0;j<list.size();j++){
                        String data=list.get(j);
                        System.out.println(Thread.currentThread().getName()+" 读取 "+data);
                    }
                };
            };thread.start();
        }
    }
}
