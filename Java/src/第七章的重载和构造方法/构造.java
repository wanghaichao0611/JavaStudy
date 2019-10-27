package 第七章的重载和构造方法;
class Cylinder1
{
    private double radius;
    private int height;
    private  double pi=3.14;
    public Cylinder1(double r,int h)
    {
        radius=r;
        height=h;
    }
    double area()
    {
        return pi*radius*radius;
    }
    double volume()
    {
       return area()*height;
    }
}
public class 构造 {
    public  static  void main(String[] args)
    {
        Cylinder1 volu=new Cylinder1(3.5,8);
        System.out.println("圆柱体面积="+volu.area());
        System.out.println("圆柱体体积="+volu.volume());
    }
}
