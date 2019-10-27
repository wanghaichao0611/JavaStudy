package 第十二章泛型与容器类;
import java.util.*;//Iterator是对list从前往后遍历，ListIterator支持对list双向遍历；
public class 创建一个线性表数组并且修改元素和遍历
{
    public static void main(String[] args)
    {
        List<Integer> a1=new ArrayList<Integer>();
        for(int i=1;i<5;i++)
        a1.add(new Integer(i));
        System.out.println("数据列表的原始数据"+a1);
        ListIterator<Integer> listIter=a1.listIterator();
        listIter.add(new Integer(0));
        System.out.println("添加数据后的数据列表"+a1);
        if(listIter.hasNext())
        {
            int i=listIter.nextIndex();
            listIter.next();
            listIter.set(new Integer(9));
            System.out.println("修改后的数组列表"+a1);
        }
        listIter=a1.listIterator(a1.size());//重新创建从a1最后位置开始的迭代器listIter
        System.out.print("反响遍历数组列表:");
        while(listIter.hasPrevious())
            System.out.print(listIter.previous()+" ");
    }
}
