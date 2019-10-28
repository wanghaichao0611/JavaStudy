package 二叉搜索树;


//插入节点和中序遍历
public class BinaryTree<T extends Comparable<?super T>> {
    private Node<T> root;//根节点
    public Node<T> getRoot(){
        return root;
    }
    //先序遍历二叉搜索树
    public void perOrder(Node<T> root){
        if (root==null){
            return;
        }
        System.out.print(root.getData()+",");
        perOrder(root.left);//递归输出左子树
        perOrder(root.right);//递归输出右子树
    }
    //中序遍历二叉搜索树
    public void inOrder(Node<T> root){
        if (root==null){
            return;
        }
        inOrder(root.left);//遍历左子树
        System.out.print(root.getData()+",");
        inOrder(root.right);//遍历右子树
    }
    //后续遍历二叉搜索树
    public void  postOrder(Node<T> root){
        if (root==null){
            return;
        }
        postOrder(root.left);//遍历左子树
        postOrder(root.right);//遍历右子树;
        System.out.print(root.getData()+",");
    }
    //搜索最小值
    public Node<T> searchMinValue(Node<T> node){
        if (node==null || node.getData()==null){
            return null;
        }
        if (node.left==null){
            return node;
        }
        return searchMinValue(node.left);//递归从左子树找最小值
    }
    //搜索最大值
    public  Node<T> serachMaxValue(Node<T> node){
        if (node==null || node.getData()==null){
            return null;
        }
        if (node.right==null){
            return node;
        }
        return serachMaxValue(node.right);
    }
    //插入一个节点
    public void insert(Node<T> node,T newData){
        if (this.root==null){
            this.root=new Node<T>(newData,null,null);
            return;
        }
        int compareValue=newData.compareTo(node.getData());
        if (compareValue<0){
            //递归左子树，继续寻找插入点
            if (node.left==null){
                node.left=new Node<T>(newData,null,null);
            }
            else {
                insert(node.left,newData);
            }
        }
        else if (compareValue>0){
            //递归右子树,继续寻找插入点
            if (node.right==null){
                node.right=new Node<T>(newData,null,null);
            }
            else {
                insert(node.right,newData);
            }
        }
    }
    //删除一个节点
    public Node<T> remove(Node<T> node,T newData){
        if (node==null){
            return node;
        }
        int compareValue=newData.compareTo(node.getData());
        if (compareValue>0){
            node.right=remove(node.right,newData);
        }
        else if (compareValue<0){
            node.left=remove(node.left,newData);
        }
        else if (node.left!=null && node.right!=null){

            node.setData(searchMinValue(node.right).getData());//找到右子树最小结点替换当前结点
            node.right=remove(node.right,node.getData());
        }
        else {
            node=(node.left!=null) ? node.left:node.right;
        }
        return node;
    }
}
