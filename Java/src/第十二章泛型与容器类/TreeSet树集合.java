package 第十二章泛型与容器类;
import java.util.*;
public class TreeSet树集合 {
    public static void main(String[] args)
    {
        Set<String> hs=new HashSet<String>();
        hs.add("唐僧");
        hs.add("孙悟空");
        hs.add("猪八戒");
        hs.add("沙和尚");
        hs.add("白龙马");
        TreeSet<String> ts=new TreeSet<String>(hs);
        Iterator a=hs.iterator();
        System.out.print("哈希表为:");
        {
            while(a.hasNext())
                System.out.print(a.next()+" ");
        }
        System.out.println();
        System.out.println("树集合:"+ts);
        System.out.println("树集合的第一个元素:"+ts.first());
        System.out.println("树结合的最后一个元素:"+ts.last());
        System.out.println("heddSet(孙悟空)的元素:"+ts.headSet("孙悟空"));
        System.out.println("tailSet(孙悟空)的元素:"+ts.tailSet("孙悟空"));
        System.out.println("ceiling(沙)的元素:"+ts.ceiling("沙"));

    }
}
