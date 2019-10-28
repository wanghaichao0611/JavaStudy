package 数组实现ArrayList线性表集合;

public interface List {
    public void add(Object element);//添加元素
    public Object get(int index);//获得元素
    public Object set(int index,Object element);//修改元素
    public Object remove(int index);//删除元素
    public int size();//集合大小
}
