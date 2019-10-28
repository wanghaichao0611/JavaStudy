package 建造模式原理;
//建造实现类
public class ConcreteBuilder implements Builder {
    Car car=null;
    public ConcreteBuilder(){
        car=new Car();
    }

    @Override
    public void  builderHead() {
        car.setHead("头部建造完成");
    }

    @Override
    public void builderBody() {
        car.setBody("身体部建造完成");
    }

    @Override
    public void builderFoot() {
        car.setFoot("汽车尾部建造完成");
    }

    @Override
    public Car builderPart() {
        return car;
    }
}
