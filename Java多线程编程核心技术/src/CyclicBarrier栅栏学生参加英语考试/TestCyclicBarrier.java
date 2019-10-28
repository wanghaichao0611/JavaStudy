package CyclicBarrier栅栏学生参加英语考试;


import java.util.Random;
import java.util.concurrent.CyclicBarrier;
/**从结果上看10个学生同时参加考试，需要等到10个线程都调用了cyclicBarrier.await才能同意打印成绩
 * CountDownLatch和CyclicBarrier都能实现线程之间的等待，不同点:
 * CountDownLatch一般用于某个线程等待若干个其他线程执行完任务之后，它才执行,线程的汇聚,不能够重用
 * CyclicBarrier一般用于线程相互等待至某个状态，然后这一组线程再同时执行，线程汇聚以后各自发散,可以重用.
 * **/

//CyclicBarrier是一个所有线程必须等待的一个状态，知道所有线程达到这个状态，所有线程才能各自往下执行
//1.例子:一个班级10个学生参加英语考试，只有等待所有考生交卷后，打印出学生各自成绩
public class TestCyclicBarrier {
    private static Random rn = new Random();
    private static int[] scores = {60, 70, 80, 90, 100};
    public static void main(String[] args)
    {
        //假设一个班 10 个人参加英语考试
        int studentCount=10;
        CyclicBarrier cyclicBarrier=new CyclicBarrier(studentCount);
        //开始 10 个线程 表示10个学生参加考试
        for (int i=1;i<=studentCount;i++){
            TestEnglish testEnglish=new TestEnglish(cyclicBarrier);
            new Thread(testEnglish,"学生"+i).start();
        }
    }
        static class TestEnglish implements Runnable {
            private CyclicBarrier cyclicBarrier;

            public TestEnglish(CyclicBarrier cyclicBarrier) {
                this.cyclicBarrier = cyclicBarrier;
            }

            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " 开始考试");
                    Thread.sleep(2000);//假设考生经历两秒
                    cyclicBarrier.await();//等待所有考生考完才能打印成绩
                    System.out.println(Thread.currentThread().getName() + " 成绩 " +scores[rn.nextInt(5)]);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
}