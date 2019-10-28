package 队列Queue;

public class IteratorImpl implements Iterator {
    private Node currentNode;
    private Queue queue;

    public IteratorImpl(Queue queue,Node head){
        this.queue=queue;
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
