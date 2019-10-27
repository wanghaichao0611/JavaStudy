package 第七章的重载和构造方法;

class Person1
{
    private String name;
    private int age;
    public Person1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void show()
    {
        System.out.println("姓名:"+name+" 年龄"+age);
    }
}
public class 对象数组的应用 {
    public static void main(String[] args)
    {
        Person1[] per=new Person1[3];
        per[0]=new Person1("张三",20);
        per[1]=new Person1("李四",21);
        per[2]=new Person1("王二",19);
        per[2].show();
        per[0].show();
    }
}
