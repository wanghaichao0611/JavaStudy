package 双循环链表;

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
public class TestDoubleCricleLink {
    public static void main(String[] args) {
        //构建一个北京2号线的双向循环链表
        Node[] head_tail = init();
        Node head = head_tail[0];
        Node tail = head_tail[1];

        //打印双向循环链表
        System.out.println("初始化链表结果:");
        print(head, tail);

        //在位置2插入一个结点
        System.out.println("位置2插入 北京站 结点效果");
        insert(head, 2, new Node("北京站", null, null));

        //在位置2删除一个结点
        System.out.println("位置2 删除 结点效果:");
        remove(head, 2);
        print(head, tail);

        //在位置2替换一个结点
        System.out.println("位置2替换成 朝阳门 结点结果");
        repalce(head, 2, new Node("朝阳门", null, null));
        print(head, tail);
    }

    public static Node[] init() {
        //初始化结点头"西直门"
        Node head = new Node("西直门", null, null);

        //下一个节点"车庄公",上一个节点为head，并将头节点的next设置为node2
        Node node2 = new Node("大望路", head, null);
        head.setNext(node2);

        //下一个节点"朝阳门"，上一个结点是node2，并将node2的next设置为node3
        Node node3 = new Node("国贸", node2, null);
        node2.setNext(node3);

        //尾节点"东直门"，上一个节点为node3，并将node3的next设置为tail
        Node tail = new Node("木樨地", node3, head);
        node3.setNext(tail);
        head.setPrev(tail);
        Node[] head_tail = new Node[]{head, tail};
        return head_tail;
    }

    //在链表任意位置插入一个节点
    public static void insert(Node node, int insertPosition, Node newNode) {
        Node p = node;
        int i = 0;
        //将节点移动到插入位置
        while (p.getNext() != null && i < insertPosition) {
            p = p.getNext();
            i++;
        }
        newNode.setNext(p.getNext());//新节点next指向下一个节点
        p.setNext(newNode);//当前next指向新节点
        newNode.setPrev(p);//新节点prev指向前结点
        newNode.getNext().setPrev(newNode);//新节点的下一个节点的prev，指向新节点
    }

    //在链表任意位置删除一个节点
    public static void remove(Node node, int removePosition) {
        Node p = node;
        int i = 0;
        //将节点移动到删除前一个节点
        while (p.getNext() != null && i < removePosition - 1) {
            p = p.getNext();
            i++;
        }
        Node temp = p.getNext();//保存要删除的结点
        p.setNext(p.getNext().getNext());//前一个结点next指向要删除结点的next
        p.getNext().setPrev(p);
        temp.setNext(null);//将删除结点的next设置为null
        temp.setPrev(null);//将删除结点的next设置为null
    }

    //在链表任意位置修改替换一个结点
    public static void repalce(Node node, int replacePosition, Node newNode) {
        Node p = node;
        int i = 0;
        //将节点移动到替换前一个节点位置
        while (p.getNext() != null && i < replacePosition - 1) {
            p = p.getNext();
            i++;
        }
        Node temp = p.getNext();//保存要删除的节点
        newNode.setNext(p.getNext().getNext());
        p.getNext().getNext().setPrev(newNode);
        newNode.setPrev(p);
        p.setNext(newNode);
        temp.setNext(null);
        temp.setPrev(null);
    }

    public static void print(Node node, Node tail) {
        //输出北京地铁2号线循环双向链表
        Node p = node;
        Node startNode = node;
        int circleCount = 0;//循环打印次数
        while (circleCount < 2) {
            //从头开始直到尾结束,再从尾到头循环打印
            String data = p.getData();
            System.out.print(data + "->");
            p = p.getNext();
            if (p.getNext()==startNode){
                circleCount++;
            }
        }
        String data=p.getData();
        System.out.print(data+"\n");
        circleCount=0;//循环打印次数
        p=tail;
        startNode=tail;
        while (circleCount<2){
            //从尾开始到头，再从头到尾循环打印
            data=p.getData();
            System.out.print(data+"->");
            tail=p;
            p=p.getNext();
            if (p.getNext()==startNode){
                circleCount++;
            }
        }
        data=p.getData();
        System.out.print(data+"\n\n");
    }
}
