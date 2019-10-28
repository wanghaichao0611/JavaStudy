package 链表实现LinkedList线性表集合;

//节点内部类，双向
 class Node {
    private Object data;//节点数据
    private Node prev;//上一个节点
    private Node next;//下一个节点
    public Node(Object data,Node prev,Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
