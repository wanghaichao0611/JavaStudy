package BlockingQueue队列ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//测试非阻塞方法，poll
class Hospital1{
    private BlockingQueue<String> queue;
    public Hospital1(int maxSize){
        queue=new ArrayBlockingQueue<String>(maxSize);
    }
    public boolean add(String data){
     return queue.offer(data);
    }
    public String take(){
      return queue.poll();
    }
}
public class TestBlockingQueue1 {
    public static void main(String[] args){
        final Hospital1 hospital=new Hospital1(5);//假设医院每次最多排队人数为5人

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
