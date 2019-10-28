package Semaphore信号量模拟Tomact服务器客户端并发访问;

import java.util.concurrent.Semaphore;

/**信号量就是指定数量的许可。每调用一次acquire(),一个许可被调用线程取走。每调用一次release()，一个许可返还给信号量
 * ,其他线程继续使用。类似Lock锁
 * 1.例子:模拟Tomact的Web服务器当启动Tomact的时候可以配置最大可接受客户端访问.
 * 超过最大值 客户端等待，其他客户端释放连接.
 * **/
public class TestSemaphore {
    static class  TomcatContainer{
        private Semaphore semaphore;
        public TomcatContainer(int maxWorker){
            semaphore=new Semaphore(maxWorker);
        }
        public void openWorker() {
            try {
                semaphore.acquire();//获得锁
                System.out.println(Thread.currentThread().getName() + " 已连接");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        public void closeWorker(){
            System.out.println(Thread.currentThread().getName()+" 已退出关闭连接");
            semaphore.release();//释放锁
        }
    }
    public static void main(String[] args){

        //设置Tomact最大能接受 5个 客户端同时并发 访问
        final TomcatContainer tomcatContainer=new TomcatContainer(5);

        //开启10个客户端连接
        for (int i=1;i<=10;i++){
            Thread thread=new Thread("客户端"+i){
                @Override
                public void run() {
                    try{
                        tomcatContainer.openWorker();//打开连接
                        Thread.sleep(1000);//假设处理业务 1秒
                        tomcatContainer.closeWorker();//关闭连接
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                };
            };thread.start();
        }
    }
}
