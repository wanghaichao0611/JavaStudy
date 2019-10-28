package ExecutorService线程池铁运行例子;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Executors.newFixThreadPool(int) 创建 指定个数的线程同时运行的 固定大小线程池
//从结果上看 地铁1，2同时无序运行完毕以后 地铁车3 才开始运行
class SubWay2 implements Runnable{
    private String name;
    private String[] sites;
    public SubWay2(String name,String[] sites){
        this.name=name;
        this.sites=sites;
    }

    @Override
    public void run() {
        try{
            System.out.println(name+"正在运行");
            for (int i=0;i<sites.length;i++){
                System.out.println(name+" 当前运行站点:"+sites[i]);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class TestNewFixThreadPool {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        String[] sites={"北京西站","复兴门","朝阳门"};

        //开启三个线程
        for (int i=1;i<=3;i++){
            executorService.execute(new SubWay2("地铁车"+i,sites));
        }
        executorService.shutdown();
    }
}
