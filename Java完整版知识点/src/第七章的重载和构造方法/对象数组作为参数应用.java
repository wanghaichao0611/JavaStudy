package 第七章的重载和构造方法;
class Person2
{
    private String name;
    private int age;
    public Person2(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public static int minAge(Person2[] p)
    {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<p.length;i++)
            if (p[i].age<min)
                min=p[i].age;
            return min;
    }
}
public class 对象数组作为参数应用 {
    public static void main(String[] args)
    {
        Person2[] per=new Person2[3];
        per[0]=new Person2("张三",20);
        per[1]=new Person2("李四",21);
        per[2]=new Person2("王二",19);
        System.out.println("最小的年龄:"+Person2.minAge(per));
    }

}
