package 生产者消费者模式;

public class ThreadP extends Thread {
    private P p;
    public ThreadP(P p){
        super();
        this.p=p;
    }
    public void run(){
        while (true){
            p.setValue();
        }
    }
}
