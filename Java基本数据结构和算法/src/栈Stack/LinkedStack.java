package 栈Stack;

public class LinkedStack implements Stack {
    private Node head;//头节点
    private Node tail;//尾节点
    private int  size;//元素个数
    public LinkedStack(){
    }

    @Override
    public void push(Object element) {
        if (head==null){
            head=new Node(element,null,null);
            tail=head;
        }
        else {
            Node newNode=new Node(element,null,null);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail=newNode;
        }
        size++;
    }

    @Override
    public Object pop() {
        Node p=head;//获取栈头元素
        head=head.getNext();//头元素下移
        //删除的节点
        p.setNext(null);
        p.setPrev(null);
        size--;
        return p.getData();
    }

    @Override
    public Object peek() {
        return head.getData();
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(this,head);
    }

    @Override
    public int size() {
        return size;
    }
}
