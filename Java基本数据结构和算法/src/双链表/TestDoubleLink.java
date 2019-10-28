package 双链表;

class Node{
    private String data;//结点数据
    private Node prev;//上一个结点
    private Node next;//下一个几点
    public Node(String data,Node prev,Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
public class TestDoubleLink {
    public static void main(String[] args){
        //构建一个北京1号线的双向链表
        Node head=init();

        //打印双向链表
        System.out.println("初始化链表结果:");
        print(head);

        //添加一个结点
        System.out.println("链表末尾添加 永安里结果:");
        add(head,new Node("永安里",null,null));
        print(head);

        //在位置2插入一个结点
        System.out.println("位置2插入 建国门 结点效果");
        insert(head,2,new Node("建国门",null,null));

        //在位置2删除一个结点
        System.out.println("位置2 删除 结点效果:");
        remove(head,2);
        print(head);

        //在位置2替换一个结点
        System.out.println("位置2替换成 东单 结点结果");
        repalce(head,2,new Node("东单",null,null));
        print(head);
    }
    public static Node init(){
        //初始化结点头"四惠东"
        Node head=new Node("四惠东",null,null);

        //下一个节点"大望路",上一个节点为head，并将头节点的next设置为node2
        Node node2=new Node("大望路",head,null);
        head.setNext(node2);

        //下一个节点"国贸"，上一个结点是node2，并将node2的next设置为node3
        Node node3=new Node("国贸",node2,null);
        node2.setNext(node3);

        //尾节点"木樨地"，上一个节点为node3，并将node3的next设置为tail
        Node tail=new Node("木樨地",node3,null);
        node3.setNext(tail);
        return head;
    }
    //在链表末尾增加一个结点
    public static void add(Node node,Node newNode){
        Node p=node;
        //将节点移动到末尾
        while (p.getNext() != null) {
            p=p.getNext();
        }
        p.setNext(newNode);
        newNode.setPrev(p);
    }
    //在链表任意位置插入一个节点
    public static void insert(Node node,int insertPosition,Node newNode){
        Node p=node;
        int i=0;
        //将节点移动到插入位置
        while (p.getNext()!=null && i<insertPosition){
            p=p.getNext();
            i++;
        }
        newNode.setNext(p.getNext());//新节点next指向下一个节点
        p.setNext(newNode);//当前next指向新节点
        newNode.setPrev(p);//新节点prev指向前结点
        newNode.getNext().setPrev(newNode);//新节点的下一个节点的prev，指向新节点
    }
    //在链表任意位置删除一个节点
    public static void remove(Node node,int removePosition){
        Node p=node;
        int i=0;
        //将节点移动到删除前一个节点
        while (p.getNext() != null && i < removePosition - 1) {
            p=p.getNext();
            i++;
        }
        Node temp=p.getNext();//保存要删除的结点
        p.setNext(p.getNext().getNext());//前一个结点next指向要删除结点的next
        p.getNext().setPrev(p);
        temp.setNext(null);//将删除结点的next设置为null
        temp.setPrev(null);//将删除结点的next设置为null
    }
    //在链表任意位置修改替换一个结点
    public static void repalce(Node node,int replacePosition,Node newNode){
        Node p=node;
        int i=0;
        //将节点移动到替换前一个节点位置
        while (p.getNext()!=null && i<replacePosition-1){
            p=p.getNext();
            i++;
        }
        Node temp=p.getNext();//保存要删除的节点
        newNode.setNext(p.getNext().getNext());
        p.getNext().getNext().setPrev(newNode);
        newNode.setPrev(p);
        p.setNext(newNode);
        temp.setNext(null);
        temp.setPrev(null);
    }
    public static void print(Node node){
        //输出北京地铁1号线双向链表
        Node p=node;
        Node tail=null;
        while (p!=null){
            //从头开始直到尾结束
            String data=p.getData();
            System.out.print(data+"->");
            tail=p;
            p=p.getNext();
        }
        System.out.println("终点\n");
        p=tail;
        while (p!=null){
            //从尾开始知道头结束
            String data=p.getData();
            System.out.print(data+"->");
            p=p.getPrev();
        }
        System.out.print("起点\n\n");
    }
}
