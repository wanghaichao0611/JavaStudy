package 单链表;


//data/next→data/next单链表
public class TestSingleLink {
    public static void main(String[] args) {
        //构建一个北京地铁1号线的的单向链表
        Node head = init();
        //打印单向链表
        System.out.println("初始化链表的结果是：");
        print(head);
        //在末尾添加一个节点
        System.out.println("链表结尾添加 永安里 节点结果:");
        add(head, new Node("永安里", null));
        print(head);
        //在位置2插入一个节点
        System.out.println("位置2插入 建国门 节点结果:");
        insert(head, 2, new Node("建国门", null));
        print(head);
        //在位置2删除一个节点
        System.out.println("位置2 删除 节点的结果:");
        remove(head, 2);
        print(head);
        //在位置2替换一个节点
        System.out.println("位置2替换成 东单 节点结果;");
        replace(head,2,new Node("东单",null));
        print(head);
    }

    public static Node init() {
        //初始化节点 四惠东
        Node head = new Node("四惠", null);
        //下一个节点 大望路，并且将头节点的next设置为node2
        Node node2 = new Node("大望路", null);
        head.setNext(node2);
        //下一个节点 国贸，并且将node2的next设置为node3
        Node node3 = new Node("国贸", null);
        node2.setNext(node3);
        //尾节点 木樨地，并将node3的next设置为tail
        Node tail = new Node("木樨地", null);
        node3.setNext(tail);
        return head;
    }
    //末尾添加一个结点
    public static void add(Node node,Node newNode){
        Node p=node;
        //将节点移动到末尾
        while (p.getNext()!=null){
            p=p.getNext();
        }
        p.setNext(newNode);
    }
    //在链表任意位置插入一个节点
    public static void insert(Node node,int insertPosition,Node newNode){
        Node p=node;
        int i=0;
        //将节点移动到插入位置
        while (p.getNext()!=null&&i<insertPosition){
            p=p.getNext();
            i++;
        }
        newNode.setNext(p.getNext());//从新节点指向下一个节点
        p.setNext(newNode);//当前next指向新节点
    }
    //在链表任意位置删除一个节点
    public static void remove(Node node,int removePosition){
        Node p=node;
        int i=0;
        //将节点移动到删除前的一个节点
        while (p.getNext()!=null&&i<removePosition-1){
            p=p.getNext();
            i++;
        }
        Node temp=p.getNext();//保存要删除的节点
        p.setNext(p.getNext().getNext());//前一个节点next指向要删除节点的next
        temp.setNext(null);//将删除节点next设置为null
    }
    //在链表 任意位置替换一个节点
    public static void replace(Node node,int replacePosition,Node newNode){
        Node p=node;
        int i=0;
        //将节点移动到替换的前一个节点位置
        while (p.getNext()!=null&&i<replacePosition-1){
            p=p.getNext();
            i++;
        }
        Node temp=p.getNext();//保存要替换的节点
        newNode.setNext(p.getNext().getNext());//新节点next指向下一个节点的下一个节点
        p.setNext(newNode);//当前next指向新节点
        temp.setNext(null);
    }
    //输出北京1号线的链表
    public static void print(Node node){
        Node p=node;
        while (p!=null){
            String data=p.getData();
            System.out.print(data+"→");
            p=p.getNext();
        }
        System.out.print("终点\n\n");
    }
}

