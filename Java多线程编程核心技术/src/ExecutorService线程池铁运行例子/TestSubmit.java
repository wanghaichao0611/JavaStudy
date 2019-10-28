package ExecutorService线程池铁运行例子;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//submit(Callable)执行一个线程并返回结果
//从结果上看每次一个线程执行完成后，通过Future返回结果
class SubWay1 implements Callable {
    private String name;
    private String[] sites;

    public SubWay1(String name, String[] sites) {
        this.name = name;
        this.sites = sites;
    }

    public Object call() throws Exception {
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
public class TestSubmit {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        String[] sites={"北京西站","复兴门","朝阳门"};

        //开启三个线程
        for (int i=1;i<=3;i++){
           Future future=executorService.submit(new SubWay1("地铁车"+i,sites));
            try{
                Object result=future.get();//获得线程的返回结果
                System.out.println(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
