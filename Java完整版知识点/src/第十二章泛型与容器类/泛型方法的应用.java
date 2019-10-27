package 第十二章泛型与容器类;
public class 泛型方法的应用 {
    public static void main(String[] args)
    {
        Integer[] num={1,2,3,4,5};
        String[]  str={"红","橙","黄","绿","青","蓝","紫"};
        泛型方法的应用.display(num);
        泛型方法的应用.display(str);
    }
    public static <E> void display(E[] list)
    {
        for(int i=0;i<list.length;i++)
        System.out.print(list[i]+"  ");
        System.out.println();
    }
}
