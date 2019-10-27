package 第十一章多线程;
class MyThread1 implements Runnable
{
    private String who;
    public MyThread1(String str)
    {
        who=str;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep((int)(1000*Math.random()));
            }
            catch (InterruptedException e)
            {
                System.out.println(e.toString());
            }
            System.out.println(who+"正在运行!");
        }
    }
}
public class 利用Runnable接口创建线程 {
    public static void main(String[] args)
    {
       MyThread1 you=new MyThread1("你");
       MyThread1 she=new MyThread1("她");
       Thread t1=new Thread(you);
       Thread t2=new Thread(she);
       t1.start();
       t2.start();
    }
}
