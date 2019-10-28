package 二叉搜索树;

public class TestBinaryTree {
    public static void main(String[] args){
        BinaryTree<Integer> binaryTree=new BinaryTree<>();
        //构造二叉树
        binaryTree.insert(binaryTree.getRoot(),60);
        binaryTree.insert(binaryTree.getRoot(),40);
        binaryTree.insert(binaryTree.getRoot(),20);
        binaryTree.insert(binaryTree.getRoot(),10);
        binaryTree.insert(binaryTree.getRoot(),30);
        binaryTree.insert(binaryTree.getRoot(),50);
        binaryTree.insert(binaryTree.getRoot(),80);
        binaryTree.insert(binaryTree.getRoot(),70);
        binaryTree.insert(binaryTree.getRoot(),90);

        System.out.println("先序遍历二叉树");
        binaryTree.perOrder(binaryTree.getRoot());

        System.out.println("\n中序遍历二叉树");
        binaryTree.inOrder(binaryTree.getRoot());

        System.out.println("\n后序遍历二叉树");
        binaryTree.postOrder(binaryTree.getRoot());

        System.out.println("\n最小值");
        System.out.println(binaryTree.searchMinValue(binaryTree.getRoot()).getData());

        System.out.println("\n最大值");
        System.out.println(binaryTree.serachMaxValue(binaryTree.getRoot()).getData());

        System.out.println("\n删除一个值 40");
        System.out.println(binaryTree.remove(binaryTree.getRoot(),40));

        System.out.println("\n中序遍历二叉树");
        binaryTree.inOrder(binaryTree.getRoot());
    }
}
