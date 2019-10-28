package ExecutorService线程池铁运行例子;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**schedule(Callable,int time,TimeUnit timeUnit)按照指定的时间 执行线程并且返回结果
//从结果上看，地铁1，2，3每隔五秒自动启动运行
//其他方法:schedule(Callable task,long delay,TimeUnit timeunit)给定的延迟之后执行一次
//schedule(Runnable task,long delay,TimeUnit timeunit)给定的延迟之后执行一次
//scheduleAtFixedRate(Runnable,long initalDelay,long period,TimeUnit timeunit)给定的延迟之后周期循环执行
 period为前一个执行的开始和下一个执行的开始之间的间隔时间
 //scheduleWithFixedDelay(Runnable,long initalDelay,long period,TimeUnit timeunit)给定的延迟之后周期循环执行
 period为前一个执行的开始和下一个执行的开始之间的间隔时间
**/
 class SubWay5 implements Callable {
    private String name;
    private String[] sites;

    public SubWay5(String name, String[] sites) {
        this.name = name;
        this.sites = sites;
    }

    @Override
    public String call() throws Exception {
        try{
            System.out.println(name+" 正在运行");

            for (int i=0;i<sites.length;i++){
                System.out.println(name+" 当前运行站点:"+sites[i]);
                Thread.sleep(1000);
            }
            return name+" 到达终点 运行结束";
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "";
    }
}
public class TestScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        String[] sites = {"北京西站", "复兴门", "朝阳门"};

        List<Callable<String>> callables=new ArrayList<Callable<String>>();

        //开启三个线程
        for (int i=1;i<=3;i++){
            //每隔五秒启动一个线程
            ScheduledFuture scheduledFuture=scheduledExecutorService.schedule(new SubWay5("地铁车"+i,sites),5,TimeUnit.SECONDS);
            try{
                Object result=scheduledFuture.get();//获得线程结果
                System.out.println(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        scheduledExecutorService.shutdown();
    }
}