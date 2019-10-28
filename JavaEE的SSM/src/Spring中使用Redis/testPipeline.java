package Spring中使用Redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;

import java.util.List;

public class testPipeline {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring中使用Redis/Spring.xml");
        RedisTemplate redisTemplate=applicationContext.getBean(RedisTemplate.class);
        //使用Java的Lambda表达式
        SessionCallback callback=(SessionCallback)(RedisOperations ops) ->
        {
            for (int i=0;i<100000;i++)
            {
                int j=i+1;
                ops.boundValueOps("pipeline_key_"+j).set("pipeline_value_"+j);
                ops.boundValueOps("pipeline_key_"+j).get();
            }
            return null;
        };
        Long start=System.currentTimeMillis();
        List resultList=redisTemplate.executePipelined(callback);
        Long end=System.currentTimeMillis();
        System.err.println(end-start);
    }
}
