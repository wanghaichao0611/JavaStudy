package 原子类型Atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
class Book{
    private String name;
    public Book(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class TestReference {
    public static void main(String[] args){
        TestAtomicReference();
    }
    public static void TestAtomicReference(){
        //初始化
        AtomicReference<Book> atomicReference=new AtomicReference<Book>(new Book("标杆人生"));
        //获得值
        Book book=atomicReference.get();
        System.out.println(book.getName());
        //设置值
        atomicReference.set(new Book("路在脚下"));
        book=atomicReference.get();
        System.out.println(book.getName());
    }
}
