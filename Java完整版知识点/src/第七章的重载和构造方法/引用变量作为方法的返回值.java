package 第七章的重载和构造方法;
class Person
{
    private String name;
    private int age;
    public  Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public Person compare(Person p)
    {
        if (this.age>p.age)
            return this;
        else
            return p;
    }
}
public class 引用变量作为方法的返回值 {
    public static void main(String[] args)
    {
        Person per1=new Person("张三",20);
        Person per2=new Person("李四",21);
        Person per3;
        per3=per1.compare(per2);
        if(per3==per1)
            System.out.println("张三的年龄打");
        else
            System.out.println("李四的年龄大");
    }
}
