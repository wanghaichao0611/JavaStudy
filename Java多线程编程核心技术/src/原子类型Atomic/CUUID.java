package 原子类型Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class CUUID {
    private static AtomicInteger atomicInteger=new AtomicInteger(1);
    public static int generateId(){
        return atomicInteger.getAndIncrement();
    }
}
