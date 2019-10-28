package BlockingQueue之DelayQueue延迟队列;

import 生产者消费者模式.P;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//DelayQueue 延迟队列 其中的元素必须实现 java.util.concurrent.Delay接口
class Person implements Delayed {
    private String name;
    private long   bookTime;
    public Person(String name,long bookTime){
        this.name=name;
        this.bookTime=bookTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBookTime() {
        return bookTime;
    }

    public void setBookTime(long bookTime) {
        this.bookTime = bookTime;
    }

    @Override
    public int compareTo(Delayed obj) {
        Person p=(Person)obj;
        if (this.bookTime>p.getBookTime()){
            return 1;
        }
        else if (this.bookTime<p.getBookTime()){
            return -1;
        }
        return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return bookTime-System.currentTimeMillis();
    }
}
class Hospital{
    private BlockingQueue<Person> queue;
    public Hospital(int maxSize){
        queue=new DelayQueue<Person>();
    }
    public boolean add(Person data){
        try{
            queue.put(data);
            return true;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return false;
    }
    public Person take(){
        try{
            return queue.take();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }
}
public class TestBlockingQueue {
    public static AtomicInteger atomicInteger=new AtomicInteger();
    public static synchronized long getTime(){
        return System.currentTimeMillis()+(atomicInteger.incrementAndGet()*2000);
    }
    public static void main(String[] args){
        final Hospital hospital=new Hospital(5);//假设医院每次最多排队五个人

        //开启线程排队
        for (int i=1;i<=10;i++){
            Thread thread=new Thread("排队的人"+i){
                @Override
                public void run() {
                    Person p=new Person(Thread.currentThread().getName(),getTime());
                    if (hospital.add(p)){
                        System.out.println(Thread.currentThread().getName()+"预约时间"+p.getBookTime()+"已经排队成功");
                    }
                };
            };thread.start();
        }

        //开启纠诊线程
        for (int i=1;i<=10;i++){
            Thread thread=new Thread("排队的人"+i){
                @Override
                public void run() {
                    Person p=hospital.take();
                    System.out.println(p.getName()+" 预约时间:"+p.getBookTime()+"纠诊完毕");
                };
            };thread.start();
            try{
                Thread.sleep(2000);//假设每次纠诊 等待 2秒
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
