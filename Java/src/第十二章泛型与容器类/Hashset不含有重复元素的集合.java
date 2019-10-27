package 第十二章泛型与容器类;
import java.util.*;
public class Hashset不含有重复元素的集合
{
    public static void main(String[] args)
    {
        HashSet<String>hs=new HashSet<String>();
         String[] a={"I","come","I","see","I","go"};
        {
            for (int i=0;i<6;i++)
            {
                if (!hs.add(a[i]))
                    System.out.println("元素" + a[i] + "重复");
            }
        }
            System.out.println("集合的容量为:"+hs.size()+"各元素为:");
            Iterator it=hs.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
    }
}
