package LinkedList迭代器Iterator;

public class LinkedList implements List {
    private Node head;//定义头节点
    private Node tail;//定义尾节点
    private int size;//元素个数
    public LinkedList(){

    }
    //表尾插入数据，没有指定位置
    @Override
    public void add(Object element) {
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
    public Object get(int index) {
        Node p=head;
        int i=0;
        while (p.getNext()!=null && i<index)
        {
            p=p.getNext();
            i++;
        }
        return p.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object set(int index, Object element) {
        Node p=head;
        int i=0;
        while (p.getNext()!=null && i<index){
            p=p.getNext();
            i++;
        }
        p.setData(element);
        return element;
    }

    @Override
    public Object remove(int index) {
        Node p=head;
        int i=0;
        while (p.getNext()!=null && i<index){
            p=p.getNext();
            i++;
        }
        Node temp=p;//保存要删除的节点
        p.getPrev().setNext(p.getNext());
        p.getNext().setPrev(p.getPrev());
        temp.setNext(null);
        temp.setPrev(null);
        size--;
        return temp.getData();
    }
    public Iterator iterator(){
        return new IteratorImpl(this,head);
    }
}