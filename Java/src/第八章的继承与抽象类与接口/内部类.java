package 第八章的继承与抽象类与接口;
public class 内部类 {
    private int age;
    public class Student
    {
        String name;
        public Student(String n,int a)
        {
            name=n;
            age=a;
        }
        public void  output()
        {
            System.out.println("姓名:"+this.name+";年龄:"+age);
        }
    }
public void output()
{
    Student  stu=new Student("刘  洋",24);
    stu.output();
}
public static void main(String[] args)
{
    内部类 g=new 内部类();
    g.output();
}
}
