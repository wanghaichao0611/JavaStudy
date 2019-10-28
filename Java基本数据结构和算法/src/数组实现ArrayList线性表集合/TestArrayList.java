package 数组实现ArrayList线性表集合;

public class TestArrayList {
    public static void main(String[] args){
        //初始化
        List list=new ArrayList();
        list.add("李阳");
        list.add("王涛");
        list.add("张三");
        print(list);
        //修改张三为李四
        list.set(2,"李四");
        print(list);
        //删除王涛
        list.remove(1);
        print(list);
    }
    //打印输出List
    public static void print(List list){
        //循环输出
        for (int i=0;i<list.size();i++){
            Object obj=list.get(i);
            System.out.print(obj+",");
        }
        System.out.print("\n");
    }
}
