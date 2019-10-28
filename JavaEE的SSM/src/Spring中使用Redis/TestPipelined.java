package Spring中使用Redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.List;

public class TestPipelined {
    @Test
    public void Test()
    {
        Jedis jedis=new Jedis("localhost",6379);
        long start=System.currentTimeMillis();
        //开启流水线
        Pipeline pipeline=jedis.pipelined();
        //这里测试10万条的读/写2个操作
        for (int i=0;i<100000;i++)
        {
            int j=i+1;
            pipeline.set("pipeline_key_"+j,"pipeline_value_"+j);
            pipeline.get("pipeline_key_"+j);
        }
        //pipeline.syncAndReturnALL();将执行返回过的命令返回List列表结果
        List result=pipeline.syncAndReturnAll();
        Long end=System.currentTimeMillis();
        //计算耗时
        System.err.println("耗时："+(end-start)+"毫秒");
    }
}
