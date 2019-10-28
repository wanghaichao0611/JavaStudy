package 建造模式原理;
//组装成 汽车Car的类
public class Director {
    public static Car construct(Builder builder){
        builder.builderHead();
        builder.builderBody();
        builder.builderFoot();
        return builder.builderPart();
    }
}
