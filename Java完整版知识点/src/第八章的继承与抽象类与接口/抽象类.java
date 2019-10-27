package 第八章的继承与抽象类与接口;
abstract class Shape
{
    protected String name;
    public Shape(String xm)
    {
        name=xm;
        System.out.print("名称:"+name);
    }
    abstract public double getArea();
    abstract public double getLength();
}
class Circle extends Shape
{
    private final double pi=3.14;
    private double radius;
    public Circle(String shapeName,double r)
    {
        super(shapeName);
        radius=r;
    }
    public double getArea()
    {
        return pi*radius*radius;
    }
    public double getLength()
    {
        return 2*pi*radius;
    }
}
class Rectangle extends Shape
{
    private double width;
    private double height;
    public Rectangle(String shapeName,double width,double height)
    {
        super(shapeName);
        this.width=width;
        this.height=height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getLength()
    {
        return 2*(width+height);
    }
}
public class 抽象类 {
    public static void main(String[] args)
    {
        Shape rect = new Rectangle("长方形",6.5,10.3);
        System.out.print("；面积="+rect.getArea());
        System.out.println("；周长="+rect.getLength());
        Shape circle=new Circle("圆",10.2);
        System.out.print("；面积="+circle.getArea());
        System.out.println("；周长="+circle.getLength());
    }
}
