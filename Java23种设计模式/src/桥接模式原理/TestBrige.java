package 桥接模式原理;


//测试
public class TestBrige {
    public static void main(String[] args){
        Person man=new Man("男人");
        Person lady=new Lady("女人");

        Clothing jacket=new Jacket("夹克");
        Clothing trouser=new Trouser("裤子");

        man.setClothing(jacket);//男人 穿 夹克
        man.dress();

        man.setClothing(trouser);//男人 穿 裤子
        man.dress();

        lady.setClothing(jacket);//女人 穿 夹克
        lady.dress();

        lady.setClothing(trouser);//女人 穿 裤子
        lady.dress();
    }
}
