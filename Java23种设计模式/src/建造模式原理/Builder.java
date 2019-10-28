package 建造模式原理;
//建造接口
public interface Builder {
    public abstract void builderHead();
    public abstract void builderBody();
    public abstract void builderFoot();
    public Car builderPart();
}
