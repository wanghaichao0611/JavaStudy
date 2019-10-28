package BlockingQueue队列ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class Hospital2{
    private BlockingQueue<String> queue;
    public Hospital2(int maxSize){
        queue=new ArrayBlockingQueue<String>(maxSize);
    }
    public boolean add(String data){
        try{
            return queue.offer(data,2,TimeUnit.SECONDS);
            //等待两秒继续进入队列，否则超时离开
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return false;
    }
    public String take(){
        try{
            return queue.poll(2,TimeUnit.SECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }
}
public class TestBlockingQueue2 {
    public static void main(String[] args){
        final Hospital2 hospital=new Hospital2(5);//假设医院每次最多排队人数为5人

        //开启排队线程
        for (int i=1;i<=10;i++){
            Thread thread=new Thread("排队的人"+i){
                @Override
                public void run() {
                    if (hospital.add(Thread.currentThread().getName())){
                        System.out.println(Thread.currentThread().getName()+" 已成功排队");
                    }
                };
            };thread.start();
        }

        //开启纠诊线程
        for (int i=1;i<=10;i++){
            Thread thread=new Thread(){
                @Override
                public void run() {
                    String date=hospital.take();
                    System.out.println(date+" 纠诊完毕");
                };
            };thread.start();
            try{
                Thread.sleep(2000);//假设每次纠诊 等待两秒
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
