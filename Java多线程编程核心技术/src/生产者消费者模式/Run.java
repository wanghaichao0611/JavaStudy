package 生产者消费者模式;

public class Run {
    public static void main(String[] args){
        String lock=new String("");
        P p=new P(lock);
        C c=new C(lock);
        ThreadP threadP=new ThreadP(p);
        ThreadC threadC=new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
