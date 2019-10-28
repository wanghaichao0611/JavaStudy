package LinkedList迭代器Iterator;

public class IteratorImpl implements Iterator {
    private Node currentNode;
    private List list;
    public IteratorImpl(List list,Node head){
        this.list=list;
        this.currentNode=head;
    }

    @Override
    public boolean hasNext() {
        return currentNode!=null;
    }

    @Override
    public Object next() {
        Object element=null;
        element=currentNode.getData();
        currentNode=currentNode.getNext();
        return element;
    }
}
