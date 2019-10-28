package BlockingQueue之PriorityBlockingQueue优先级阻塞队列;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

//PriorityBlockingQueue 优先级阻塞队列 其中的元素必须实现java.lang.Comparable接口
class Person implements Comparable{
    private String name;
    private int age;
    public Person(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //按年龄升序排序
    @Override
    public int compareTo(Object obj) {
        Person p=(Person)obj;
        if (this.age>p.getAge()){
            return 1;
        }
        else if (this.age<p.getAge()){
            return -1;
        }
        return 0;
    }
}
class Hospital {
    private BlockingQueue<Person> queue;

    public Hospital(int maxSize) {
        queue = new PriorityBlockingQueue<>(maxSize);
    }

    public boolean add(Person data) {
        try {
            queue.put(data);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Person take() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
public class TestBlockingQueue {
    public static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        final Hospital hospital = new Hospital(5);//假设医院每次最多排队5个人

        //开启排队线程
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread("排队的人" + i) {
                @Override
                public void run() {
                    Person p = new Person(Thread.currentThread().getName(), 20 + atomicInteger.incrementAndGet());
                    if (hospital.add(p)) {
                        System.out.println(Thread.currentThread().getName() + " 年龄 " + p.getAge() + "已经排队成功");
                    }
                }

                ;
            };
            thread.start();
        }

        //开启纠诊线程
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    Person p = hospital.take();
                    System.out.println(p.getName() + " 年龄 :" + p.getAge() + "纠诊完毕");
                }

                ;
            };
            thread.start();
            try {
                Thread.sleep(2000);//假设每次纠诊 等待两秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
