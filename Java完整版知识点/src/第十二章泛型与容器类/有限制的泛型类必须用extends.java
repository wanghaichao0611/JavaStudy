package 第十二章泛型与容器类;
class 有限制的泛型类 <T extends Number>{
    T obj;
    public  有限制的泛型类(T obj)
    {
        this.obj=obj;
    }
    public T getObj()
    {
        return obj;
    }
}
public class 有限制的泛型类必须用extends
{
    public static void main(String[] args)
    {
        有限制的泛型类<Double> num=new 有限制的泛型类<Double>(5.001002);
        System.out.println("给出的参数是:"+num.getObj());
        有限制的泛型类<Integer> s=new 有限制的泛型类<Integer>(50);
        System.out.println("给出的参数是:"+s.getObj());
    }
}

