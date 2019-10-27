package 第八章的继承与抽象类与接口;
interface IShape
{
    final double pi=3.14;
    abstract double getArea();
    abstract  double getLength();
}
class Circle1 implements IShape
{
    double radius;
    public Circle1(double r)
    {
        radius=r;
    }
    public double getArea()
    {
        return pi*radius*radius;
    }
    public  double getLength()
    {
        return 2*pi*radius;
    }
}
class Rectangle1 implements IShape
{
    private double width;
    private double height;
    public Rectangle1(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getLength()
    {
        return  2*(width+height);
    }
}
public class 接口 {
    public static void main(String[] args)
    {
        IShape circle=new Circle1(5.0);
        System.out.print("圆面积="+circle.getArea());
        System.out.println("；周长="+circle.getLength());
        Rectangle1 rect=new Rectangle1(6.5,10.8);
        System.out.print("矩形面积="+rect.getArea());
        System.out.println("；周长="+rect.getLength());
    }
}
