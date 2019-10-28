package ThreadLocal客户端访问网页的次数;

//ThreadLocal:为变量在每个线程中都创建一个副本，每个线程都可以访问自己内部的变量
//从结果上看应该是每个客户端 访问页面1次，而不是多次
public class TestThreadLocal {
    public static void main(String[] args){
        //单实例Servlet
        final Servlet servlet=new Servlet();

        //启动 10 个客户端线程 同时访问
        for (int i=1;i<=10;i++){
            Thread threadCustomer=new Thread("客户端线程"+i){
                @Override
                public void run() {
                    servlet.service();//访问 Servlet一次
                };
            };threadCustomer.start();
        }
    }
    static class Servlet{
        private int userCount;
        public void service(){
            userCount++;
            System.out.println(Thread.currentThread().getName()+" 访问页面 :"+userCount+" 次 ");
        }
    }
}
