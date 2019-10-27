package 第九章异常的处理;
public class 异常的处理 {
    public  static void main(String[] args)
    {
        int i;
        int[] a={1,2,3,4};
        for (i=0;i<5;i++)
            System.out.println("a["+i+"]="+a[i]);
        System.out.println("5/0"+(5/0));
    }
}
