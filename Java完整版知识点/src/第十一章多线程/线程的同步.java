package 第十一章多线程;
class Mbank
{
    public static int sum=2000;
    public synchronized static void take(int k)
    {
        int temp=sum;
        temp-=k;
        try
        {
            Thread.sleep((int)(1000*Math.random()));
        }
        catch (InterruptedException e){}
        sum=temp;
        System.out.println("sum="+sum);
    }

}
class Customer extends Thread
{
    public void run()
    {
        for(int i=1;i<=4;i++)
            Mbank.take(100);
    }
}
public class 线程的同步 {
    public static void main(String[] args)
    {
        Customer c1=new Customer();
        Customer c2=new Customer();
        c1.start();
        c2.start();
    }
}
