package 第九章异常的处理;
class CircleException extends Exception
{
    double radius;
    CircleException(double r)
    {
        radius=r;
    }
    public String toSting()
    {
        return "半径 r="+radius+"不是一个正数";
    }
}
class Cirle
{
    private double radius;
    public void setRadius(double r) throws CircleException
    {
        if(r<0)
            throw new CircleException(r);
        else
            radius=r;
    }
    public void show()
    {
        System.out.println("圆面积="+3.14*radius*radius);
    }
}

public class 自定义异常类 {
    public static void main(String[] args)
    {
        Cirle cir=new Cirle();
        try
        {
            cir.setRadius(-2.0);
        }
        catch (CircleException e)
        {
            System.out.println("自定义异常:"+e.toSting()+"");
        }
        cir.show();
    }
}
