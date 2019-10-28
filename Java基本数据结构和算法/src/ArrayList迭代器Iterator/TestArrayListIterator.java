package ArrayList迭代器Iterator;

public class TestArrayListIterator {
    public static void main(String[] args) {
        //初始化
        List list = new ArrayList();
        list.add("李阳");
        list.add("王涛");
        list.add("赵亮");
        //迭代打印集合元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
