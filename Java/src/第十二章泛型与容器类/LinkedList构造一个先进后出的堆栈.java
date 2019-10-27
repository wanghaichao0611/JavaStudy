package 第十二章泛型与容器类;
import java.util.*;
class StringStack
{
    private LinkedList<String> id=new LinkedList<String>();
    public void push(String name)
    {
        id.addFirst(name);
    }
    public String pop()
    {
        return id.removeFirst();
    }
    public boolean isEmpty()
    {
        return id.isEmpty();
    }
}
public class LinkedList构造一个先进后出的堆栈
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringStack stack=new StringStack();
        System.out.println("请输入数据（quit结束）");
        while(true)
        {
            String input =sc.next();
            if(input.equals("quit"))
                break;
            stack.push(input);
        }
        System.out.println("先进后出的顺序: ");
        while(!stack.isEmpty())
            System.out.print(stack.pop()+" ");
    }
}
