package 第七章的重载和构造方法;
class Cylinder{
    private double radius;
    private  int height;
    private  double pi=3.14;
    private  String color;
    public  double  setCylinder(double r,int h)
    {
        radius=r;
        height=h;
        return r+h;
    }
    public  void  setCylinder(String str)
    {
        color=str;
    }
    public void  shouw()
    {
        System.out.println("圆柱体的颜色:"+color);
    }
    double area()
    {
        return pi*radius*radius;
    }
    double volume(){
        return area()*height;
    }
}
public class 重载 {
  public static void main(String[] args){
      double r_h;
      Cylinder volu=new Cylinder();
      r_h=volu.setCylinder(2.5,5);
      volu.setCylinder("红色");
      System.out.println("圆柱底半径和高之和="+r_h);
      System.out.println("圆柱体体积="+volu.volume());
      volu.shouw();

  }


}
