package ArrayList迭代器Iterator;

public class IteratorImpl implements Iterator {
    private int index;
    private List list;
    public IteratorImpl(List list){
        this.list=list;
    }
    //是否有下一个元素
    @Override
    public boolean hasNext() {
        return index<list.size();
    }
    //获得下一个元素

    @Override
    public Object next() {
        Object element=null;
        if (index<list.size()){
            element=list.get(index);
            index++;
        }
        return element;
    }
}
