package 原子类型Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TestInteger {
    public static void main(String[] args){
        TestAtomicInteger();
    }
    public static void TestAtomicInteger(){
        //初始化默认为0
        AtomicInteger atomicInteger=new AtomicInteger(100);
        //获得值
        int value=atomicInteger.get();
        System.out.println(value);
        //设置值
        atomicInteger.set(200);
        value=atomicInteger.get();
        System.out.println(value);
        //增加一个值返回增加前的值
        value=atomicInteger.getAndAdd(10);
        System.out.println(value);
        //增加一个值返回增加后的值
        value=atomicInteger.addAndGet(10);
        System.out.println(value);
        //自增1，然后返回增加后的值
        value=atomicInteger.incrementAndGet();
        System.out.println(value);
        //自减1，然后返回减少后前值
        value=atomicInteger.decrementAndGet();
        System.out.println(value);
    }
}
