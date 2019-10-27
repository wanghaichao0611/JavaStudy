package 第十一章多线程;
class MYThread extends Thread
{
    private String who;
    public MYThread(String str)
    {
        who=str;
    }
    public  void run()
    {
        for (int i=0;i<5;i++)
        {
            try
            {
                sleep((int)(1000*Math.random()));
            }
            catch (InterruptedException e){}
            System.out.println(who+"正在运行");
        }
    }
}
public class 利用Thread类的子类创建线程 {
    public static void main(String[] args)
    {
        MYThread you=new MYThread("你");
        MYThread she=new MYThread("她");
        you.start();
        she.start();
        System.out.println("主方法main()运行结束!");
    }
}
