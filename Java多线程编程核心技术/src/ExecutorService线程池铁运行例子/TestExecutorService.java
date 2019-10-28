package ExecutorService线程池铁运行例子;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**线程池其实就是管理线程的容器
 * 1.Executors.newSingle ThreadExecutor 创建 只能 一个线程运行的 单线程池
 * execute(Runnable)执行一个线程不能返回结果
 * 例子:假设地铁站 每次只能允许 一辆地铁运行
 * 从结果上看,同一个时刻只能一个线程运行，其他线程等待,直到一个线程运行完毕,；另外的线程才能运行
 * **/
class SubWay implements Runnable{
    private String name;
    private String[] sites;
    public SubWay(String name,String[] sites){
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
public class TestExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        String[] sites={"北京西站","复兴门","朝阳门"};

        //开启三个线程
        for (int i=1;i<=3;i++){
            executorService.execute(new SubWay("地铁车"+i,sites));
        }
        executorService.shutdown();
    }
}
