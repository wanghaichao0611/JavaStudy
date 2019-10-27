package 第八章的继承与抽象类与接口;
class Father
{
    private String name;
    private int age;
    public Father()
    {
        System.out.println("调用了个人类的构造方法Father()");
    }
    public void setNameAge(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void show()
    {
        System.out.println("姓名:"+name+" 年龄:"+age);
    }
}
class Son extends Father
{
    private String department;
    public Son()
    {
        System.out.println("调用了学生类的构造方法Son()");
    }
    public void setDepartment(String dep)
    {
        department=dep;
        System.out.println("我是"+department+"的儿子");
    }
}
public class 子类的创建 {
    public static void main(String[] args)
    {
        Son son=new Son();
        son.setNameAge("张小三",21);
        son.show();
        son.setDepartment("计算机系");
    }

}
