package 栈Stack;

public class TestStack {
    public static void main(String[] args) {
        //初始化  一个箱子能放入很多书，后放入的书籍先取出
        Stack stack = new LinkedStack();
        stack.push("感恩赞美");
        stack.push("标杆人生");
        stack.push("家庭幸福");
        //打印栈
        print(stack);
        //取出栈头部元素(不删除)
        Object obj=stack.peek();
        System.out.println(obj);
        print(stack);
        //取出栈头部元素，并且删除
        obj=stack.pop();
        System.out.println(obj);
        print(stack);
    }
    public static void print(Stack stack){
        //迭代打印元素
        Iterator iterator=stack.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.print(obj+"<-");
        }
        System.out.println("栈尾\n");
    }
}
