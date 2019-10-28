package 叫号排队线程公平性;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//银行业务叫号，每次只能一个人办业务，其他人只能等待，用synchronized关键字实现,synchronized关键字同步锁是抢占式的，非公平
//lock可以实现顺序访问
class BankTeminal{
    private Lock lock=new ReentrantLock(true);//true设置为公平性锁
    public void doBusiness(){
        //synchronized (this){
        //System.out.println(Thread.currentThread().getName()+" 正在办理业务");
            try{
                lock.lock();
                System.out.println(Thread.currentThread().getName()+" 正在办理业务");
                Thread.sleep(5000);//办理业务持续5秒
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            finally {
                lock.unlock();
        }
    }
}
public class TestLockPriority {
    public static void main(String[] args) {
        final BankTeminal bankTeminal = new BankTeminal();
        //5个客户线程办理业务
        for (int i = 1; i<6; i++) {
            Thread thread = new Thread("客户" + i) {
                @Override
                public void run() {
                    bankTeminal.doBusiness();
                }

                ;
            };
            thread.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}