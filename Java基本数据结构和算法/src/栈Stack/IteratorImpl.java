package 栈Stack;

public class IteratorImpl implements Iterator {
    private Node currentNode;
    private Stack stack;

    public IteratorImpl(Stack stack,Node head){
        this.stack=stack;
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
