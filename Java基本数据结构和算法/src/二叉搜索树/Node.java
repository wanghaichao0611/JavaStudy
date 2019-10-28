package 二叉搜索树;

public class Node<T> {
    private T data;//节点数据
    public Node<T> left;//左子节点
    public Node<T> right;//右子节点

    public Node(){

    }
    public Node(T data,Node<T> left,Node<T> right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
