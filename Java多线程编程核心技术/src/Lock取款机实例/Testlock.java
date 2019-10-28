package Lock取款机实例;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//lock锁比synchronized锁的方法可以放在两个内
//爸爸和妈妈取款，不加lock锁
//爸爸和妈妈取款，加lock锁
//trylock判断是否可以获得锁
//trylock设置时间重新获得锁
//若是爸爸没有释放锁，则妈妈线程则会产生无限等待死锁，lockInterruptibly()允许中断等待的线程，防止死锁，lockInterruputibly写在login中
class Bank{
    private static double money=10000;
    private Lock lock=new ReentrantLock();
    public void login(Thread thread){
        //登录枷锁
        lock.lock();
        System.out.println(Thread.currentThread().getName()+" 登录进入银行"+" 当前余额为:"+money);
    }
    public void loginTryLock(Thread thread) {
        //if (!lock.tryLock())//判断是否有线程在登录
        try {
            if (!lock.tryLock(10, TimeUnit.SECONDS))//如果登录不成功 10秒后重新获得锁，尝试获得锁
            {
                System.out.println(Thread.currentThread().getName() + " 已经登录进入银行 请稍等");
            } else {
                System.out.println(Thread.currentThread().getName() + " 登录进入银行" + "当前金额为：" + money);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void logout(){
        //退出释放锁
        lock.unlock();
        System.out.println(Thread.currentThread().getName()+" 退出银行");
    }
    public  double withdraw(double withdrawMoney){
        if (this.money<withdrawMoney){
            System.out.println(Thread.currentThread().getName()+" 当前余额："+withdrawMoney+" 余额不够");
            return 0;
        }
        this.money-=withdrawMoney;
        System.out.println(Thread.currentThread().getName()+" 取款:"+withdrawMoney+" 当前银行余额:"+money);
        return withdrawMoney;
    }
}
public class Testlock {
    public static void main(String[] args) {
        final Bank bank=new Bank();
        //启动爸爸线程
        Thread fatherThread = new Thread("爸爸") {
            @Override
            public void run() {
                try {
                    //bank.login(Thread.currentThread());//爸爸登录
                    bank.loginTryLock(Thread.currentThread());
                    //过两秒取10000
                    Thread.sleep(2000);
                    bank.withdraw(10000);
                    bank.logout();//不加lock锁没有这一行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }; fatherThread.start();
        //启动妈妈线程
        Thread motherThread = new Thread("妈妈") {
            @Override
            public void run() {
                try {
                    //bank.login(Thread.currentThread());//妈妈登录 trylock妈妈先休眠后登录
                    //过五秒取10000
                    Thread.sleep(5000);
                    bank.loginTryLock(Thread.currentThread());
                    bank.withdraw(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        };motherThread.start();
    }
}