package 第十二章泛型与容器类;
class GeneralType<T>
{
    private   T obj;
    public GeneralType(T obj)
    {
        this.obj=obj;
    }
    public void setObj(T obj)
    {
        this.obj=obj;
    }
    public T getObj()
    {
        return obj;

    }
    public static void showobj(GeneralType<?extends String>o)
    {
        System.out.println("给出的值是:"+o.getObj());
    }
}
public class 类型通配符问号的使用方法 {
    public static void main(String[] args)
    {
        GeneralType<String> n=new GeneralType<String>("汪海潮");
        GeneralType.showobj(n);
        GeneralType<Double> num=new GeneralType<>(25.0);
        System.out.println("数值型值:"+num.getObj());

    }
}
