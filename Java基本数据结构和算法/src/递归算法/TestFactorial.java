package 递归算法;

import java.util.Scanner;

public class TestFactorial {
    public static void main(String[] args){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想要的阶乘:");
        n=scanner.nextInt();
        long fac=factorial(n);
        System.out.println("你的阶乘结果是:"+fac);
    }
    public static long factorial(int n){
        if (n==0){
            return 1;
        }
        else {
            return factorial(n-1)*n;//递归调用自己，一直到结束返回
        }
    }
}
