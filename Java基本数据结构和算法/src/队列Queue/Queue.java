package 队列Queue;

public interface Queue {
    public void offer(Object object);//向队列尾添加元素
    public Object poll();//获取队列头元素，并且删除
    public Object peek();//获得队列元素，不删除
    public Iterator iterator();//获取迭代器
    public int size();//集合大小
}
