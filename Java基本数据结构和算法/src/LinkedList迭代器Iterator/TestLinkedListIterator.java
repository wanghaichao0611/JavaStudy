package LinkedList迭代器Iterator;

public class TestLinkedListIterator {
    public static void main(String[] args){
        //初始化
        List list=new LinkedList();
        list.add("王毅");
        list.add("王涛");
        list.add("张萨");
        //迭代打印元素
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
    }

}
