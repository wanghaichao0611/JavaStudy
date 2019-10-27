package 第九章异常的处理;
public class throw语句 {
    public static void  main(String[] args)
    {
        int a=5,b=0;
        try
        {
            if (b==0)
                throw new ArithmeticException();
            else
                System.out.println(a+"/"+b+"="+a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("异常："+e+"被抛出了");
            e.printStackTrace();
        }
    }
}
