package volatile关键字;
//volatile使变量具有可见性，但是不具备原子特性，适合多线程对变量读操作可见性
//多个客户端线程，访问页面，统计访客总数
class Servlet{
     volatile private int userCount;
     //synchronized读取操作加锁会阻塞，高并发效率低,可以用volatile userCount来解决读取同步阻塞问题
     synchronized public void service(){
         userCount++;
     }
     //synchronized
     synchronized public int getUserCount(){
         return userCount;
     }
}
public class TestVolatile {
    public static void main(String[] args) {
        //单实例Servlet
        final Servlet servlet = new Servlet();
        //启动100个客户端线程 同时访问
        for (int i=0;i<1000;i++){
            Thread thread=new Thread(){
                @Override
                public void run() {
                    servlet.service();
                };
            };thread.start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println("总访问客户数:"+servlet.getUserCount()+" 个访问客户");
    }
}