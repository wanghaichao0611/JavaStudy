package 第十二章泛型与容器类;

public class 泛型类的定义及应用 <T>
{
    private T obj;
    public  T getObj()
    {
        return obj;
    }
    public void setObj(T obj)
    {
        this.obj=obj;
    }
public static void main(String[] args)
{
    泛型类的定义及应用<String> name=new 泛型类的定义及应用<String>();
    泛型类的定义及应用<Integer> age=new 泛型类的定义及应用<Integer>();
    name.setObj("汪海潮");
    String newName=name.getObj();
    System.out.println("姓名:"+newName);
    age.setObj(22);
    int newAge=age.getObj();
    System.out.println("年龄:"+newAge);
}
}
