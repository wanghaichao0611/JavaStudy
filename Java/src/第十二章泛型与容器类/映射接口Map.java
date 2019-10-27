package 第十二章泛型与容器类;
import java.util.*;
public class 映射接口Map
{
    public static void main(String[] args)
    {
        Map<String,String> hm=new HashMap<String,String>();
        hm.put("006","唐  僧");
        hm.put("008","孙悟空");
        hm.put("009","猪八戒");
        hm.put("007","沙和尚");
        hm.put("010","白龙马");
        System.out.println("哈希映射中的内容如下:\n"+hm);
        String str=(String) hm.remove("010");
        Set keys=hm.keySet();
        Iterator it=keys.iterator();
        System.out.println("HashMap类实现的Map映射,无序:");
        while(it.hasNext())
        {
            String xh=(String)it.next();
            String name=(String)hm.get(xh);
            System.out.println(xh+"  "+name);
        }
        TreeMap<String,String> tm=new TreeMap<String,String>();
        tm.putAll(hm);
        Iterator iter=tm.keySet().iterator();
        System.out.println("TreeMap类实现的Map映射,键值升序:");
        while(iter.hasNext())
        {
            String xh=(String)iter.next();
            String name=(String)hm.get(xh);
            System.out.println(xh+"  "+name);
        }
    }
}
