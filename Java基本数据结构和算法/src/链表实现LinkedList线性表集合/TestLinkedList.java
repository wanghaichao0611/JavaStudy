package 链表实现LinkedList线性表集合;

public class TestLinkedList {
    public static void main(String[] args){
        //初始化
        List list=new LinkedList();
        list.add("李阳");
        list.add("王涛");
        list.add("张三");
        print(list);
        //修改1的位置为胡钊
        list.set(1,"胡钊");
        print(list);
        //删除1位置的元素
        list.remove(1);
        print(list);
    }
    public static void print(List list){
        //打印元素
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.print("\n");
    }
}
