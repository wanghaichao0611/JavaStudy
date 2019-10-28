package 生产者消费者模式;

public class ThreadC extends Thread{
    private C r;
    public ThreadC(C r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        while (true){
            r.getValue();
        }
    }
}
