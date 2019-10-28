package ThreadLocal客户端访问网页的次数;

//改成ThreadLocal来实现
//从结果上看 每个客户端线程访问 页面 1次 正确
public class TestThreadLocal1 {
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
