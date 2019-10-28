package 队列Queue;

public class TestQueue {
    public static void main(String[] args){
        //初始化
        Queue queue=new LinkedQueue();
        queue.offer("张阳");
        queue.offer("王涛");
        queue.offer("张飒");
        print(queue);
        //取出队首元素(不删除)
        Object obj=queue.peek();
        System.out.println(obj);
        print(queue);//输出队列

        //取出队列首部元素，并且删除
        obj=queue.poll();
        System.out.println(obj);
        print(queue);//输出队列
    }
    public static void print(Queue queue){
        //迭代打印元素
        Iterator iterator=queue.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.print(obj+"<-");
        }
        System.out.println("队尾\n");
    }
}
