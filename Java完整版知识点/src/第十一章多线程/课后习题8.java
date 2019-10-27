package 第十一章多线程;
class Mbank1
{
    private static int num=0;
    public synchronized static void insert(int k)
    {
        int temp=num;
        temp += k;
        try
        {
            Thread.sleep(((int)(1000*Math.random())));
        }
        catch(InterruptedException e){}
        num=temp;
        System.out.println(Thread.currentThread().getName()+""+num+"RMB");
    }
}
class 自己的 implements Runnable
{
    public void run()
    {
        for (int i=0;i<3;i++)
        {
            Mbank1.insert(100);
        }
    }
}
public class 课后习题8 {
    public static void main(String[] args)
    {
        自己的 t=new 自己的();
       Thread t1=new Thread(t,"您的存款剩余金额:");
       Thread t2=new Thread(t,"您的存款剩余金额:");
       t1.start();
       t2.start();
    }
}
