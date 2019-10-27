package 第七章的重载和构造方法;
class Cylinder2
{
    private double radius;
    private  int height;
    private  double pi=3.14;
    String color;
    public Cylinder2()
    {
        radius=1;
        height=2;
        color="绿色";
    }
    public  Cylinder2(double r,int h,String str)
    {
        radius=r;
        height=h;
        color=str;
    }
    public void setColor()
    {
        System.out.println("该圆柱的颜色为:"+color);
    }
     public double area()
     {
         return pi*radius*radius;
     }
     public double volumn()
     {
         return area()*height;
     }

}
public class 构造方法的重载 {
    public static void main(String[] args)
    {
       Cylinder2 volu1=new Cylinder2();
       System.out.println("圆柱1的底面积="+volu1.area());
       System.out.println("圆柱1体积="+volu1.volumn());
       volu1.setColor();
       Cylinder2 volu2=new Cylinder2(2.5,8,"红色");
       System.out.println("圆柱2底面积="+volu2.area());
       System.out.println("圆柱2体积="+volu2.volumn());
       volu2.setColor();
    }

}


