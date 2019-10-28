package 原子类型Atomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class TestBoolean {
    public static void main(String[] args){
        TestAtomicBoolean();
    }
    public static void TestAtomicBoolean(){
        //初始化默认 false
        AtomicBoolean atomicBoolean=new AtomicBoolean();
        //获得值
        boolean value=atomicBoolean.get();
        System.out.println(value);
        //设置值
        atomicBoolean.set(true);
        value=atomicBoolean.get();
        System.out.println(value);
    }
}
