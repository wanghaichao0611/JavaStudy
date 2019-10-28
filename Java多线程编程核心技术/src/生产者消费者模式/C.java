package 生产者消费者模式;

public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock=lock;
    }
    public void getValue(){
        try{
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值是"+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
