package 工厂模式原理;
//产品工厂创建类
public class Factory {
    public static Product create(int type){
        Product p=null;
        if (type==0){
            //如果类型为0创建产品A
            p=new ProductA();
        }else if (type==1){
            //如果类型为1创建产品B
            p=new ProductB();
        }
        return p;
    }
}
