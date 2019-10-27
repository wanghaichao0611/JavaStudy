package 第七章的重载和构造方法;
class Cylinder3
{
    private  double radius;
    private  int   height;
    private  double pi=3.14;
    String color;
    public Cylinder3(double r,int h,String str)
    {
        System.out.println("有参构造方法被调用了");
        radius=r;
        height=h;
        color=str;
    }
    public Cylinder3()
    {
        this(2.5,5,"红色");
        System.out.println("无参数构造方法被调用了");
    }
    public void show()
    {
        System.out.println("圆柱底半径为"+radius);
        System.out.println("圆柱体的高为"+height);
        System.out.println("圆柱体的颜色为"+color);
    }
    double area()
    {
        return pi*radius*radius;
    }
    double volumn()
    {
        return area()*height;
    }
}
public class 从一个构造方法调用另一个构造方法 {
    public static void main(String[] args)
    {
        Cylinder3 volu= new Cylinder3();
        System.out.println("圆柱底面积="+volu.area());
        System.out.println("圆柱体体积"+volu.volumn());
        volu.show();
    }
}
