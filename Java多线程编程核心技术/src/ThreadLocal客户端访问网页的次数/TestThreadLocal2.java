package ThreadLocal客户端访问网页的次数;



//让每个客户端 访问页面 2次
//总结:ThreadLocal为变量在每个线程都创建一个副本，每个线程访问自己内部的副本变量，所以多线程并发时不会发生冲突
public class TestThreadLocal2 {
    public static void main(String[] args){
        //单实例Servlet
        final Servlet servlet=new Servlet();

        //启动 10 个客户端线程 同时访问
        for (int i=1;i<=10;i++){
            Thread threadCustomer=new Thread("客户端线程"+i){
                @Override
                public void run() {
                    for (int i=1;i<=2;i++) {
                        servlet.service();//访问 Servlet一次
                    }
                };
            };threadCustomer.start();
        }
    }
    static class Servlet{
        //获取变量 userCount.get()设置副本变量userCount.set(Object obj);
        private ThreadLocal<Integer> userCount=new ThreadLocal<Integer>();
        public void service() {
            if (userCount.get()==null){
                userCount.set(1);
            }else {
                userCount.set(userCount.get()+1);
            }
            System.out.println(Thread.currentThread().getName()+" 访问页面:"+userCount.get()+" 次");
        }
    }
}