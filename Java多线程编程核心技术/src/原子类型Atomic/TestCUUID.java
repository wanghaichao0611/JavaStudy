package 原子类型Atomic;

public class TestCUUID {
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            new Thread(){
                public void run(){
                    System.out.println(CUUID.generateId());
                }
            }.start();
        }
    }
}
