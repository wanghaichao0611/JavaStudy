package 桥接模式应用;
//测试
public class TestFly {
    public static void main(String[] args){
        Fly blueFly=new BlueFly("蓝色飞机");
        Fly redFly=new RedFly("红色飞机");

        Bullet bluelLaser=new BlueLaser("蓝色激光");
        Bullet redLaser=new RedLaser("红色激光");

        blueFly.setBullet(bluelLaser);//蓝色飞机 发射 蓝色激光
        blueFly.shoot();

        blueFly.setBullet(redLaser);//蓝色飞机 发射 红色激光
        blueFly.shoot();

        redFly.setBullet(bluelLaser);//红色飞机 发射 蓝色激光
        redFly.shoot();

        redFly.setBullet(redLaser);//红色飞机 发射 红色激光
        redFly.shoot();
    }
}
