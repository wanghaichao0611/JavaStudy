package Condition等待和通知和数据库连接池原理;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//await（long time,TimeUnit unit）设置等待超时
class Connection{
    private boolean active;//判断是否已经激活使用
    public Connection(boolean active){
        this.active=active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
class ConnectionPol{
    private int maxSize;//最大连接数
    private LinkedList<Connection> connectionLinkedList=new LinkedList<Connection>();//连接列表
    private final Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public ConnectionPol(int maxSize){
        this.maxSize=maxSize;
        for (int i=0;i<connectionLinkedList.size();i++){
            connectionLinkedList.add(new Connection(false));
        }
    }
    public void add(Connection conn){
        lock.lock();
        try{
            connectionLinkedList.add(conn);
        }finally {
            lock.unlock();
        }
    }
    public Connection get(){
        lock.lock();
        try{
            for (int i=0;i<connectionLinkedList.size();i++){
                Connection conn=connectionLinkedList.get(i);
                if (!conn.isActive()){
                    conn.setActive(true);//设置为连接状态
                    return conn;
                }
            }
            //如果连接池中没有空闲连接则添加连接，否则客户端等待
            if (connectionLinkedList.size()<maxSize){
                Connection conn=new Connection(true);
                add(conn);
                return conn;
            }else {
                try{
                    System.out.println(Thread.currentThread().getName()+" 连接池已经满，请等待。");
                   // condition.await();//连接池已满请等待
                    if (!condition.await(2, TimeUnit.SECONDS)){
                        //连接池已满，请等待两秒钟
                        System.out.println(Thread.currentThread().getName()+" 等待超时");
                    }
                    //当线程被唤醒再次获得连接
                    for (int i=0;i<connectionLinkedList.size();i++){
                        Connection conn=connectionLinkedList.get(i);
                        if (!conn.isActive()){
                            conn.setActive(true);//设置连接为激活状态
                            return conn;
                        }
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }finally {
            lock.unlock();
        }
        return null;
    }
    public void close(Connection conn){
        lock.lock();
        try{
            if (conn==null){
                return;
            }
            conn.setActive(false);
            condition.signalAll();//通知所有等待线程，有一个客户端已经释放了连接
        }finally {
            lock.unlock();
        }
    }
}
public class TestCondition {
    public static void main(String[] args){
       final ConnectionPol connectionPol=new ConnectionPol(5);//初始化连接池设置，最大连接为5
        //不断从连接池获得连接
        for (int i=1;i<=15;i++){
            Thread thread=new Thread("客户端线程"+i){
                @Override
                public void run() {
                    Connection conn=connectionPol.get();
                    if (conn!=null){
                        System.out.println(Thread.currentThread().getName()+" 获得了一个连接");
                    }
                    try{
                        Thread.sleep(10000);//5(10)秒后客户端释放连接
                        connectionPol.close(conn);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                };
            };thread.start();
        }
    }
}
