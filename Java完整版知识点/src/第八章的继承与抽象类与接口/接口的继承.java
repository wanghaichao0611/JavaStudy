package 第八章的继承与抽象类与接口;
interface Face1
{
    final double pi=3.14;
    abstract double area();
}
interface  Face2
{
    abstract void setColor(String c);
}
interface Face3 extends Face1,Face2
{
    abstract void volume();
}
public class 接口的继承 implements Face3
{
    private double radius;
    private int height;
    protected String color;
    public 接口的继承(double r,int h)
    {
        radius=r;
        height=h;
    }
    public double area()
    {
        return pi*radius*radius;
    }
    public void setColor(String c)
    {
        color=c;
        System.out.println("颜色:"+color);
    }
    public void volume()
    {
        System.out.println("圆柱体体积="+area()*height);
    }
    public static void main(String[] args)
    {
        接口的继承 volu=new 接口的继承(3.0,2);
        volu.setColor("红色");
        volu.volume();
    }
}
