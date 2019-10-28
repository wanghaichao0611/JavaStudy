package Spring中使用Redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;

import java.util.List;

public class TestLambda {
    @Test
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring中使用Redis/Spring.xml");
        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
        SessionCallback callback = (SessionCallback) (RedisOperations ops) -> {
            ops.multi();
            ops.boundValueOps("key1").set("value1");
            //注意由于命令进入队列，而没有被执行，所以采用get命令，而Value却返回为空
            String value = (String) ops.boundValueOps("key1").get();
            System.out.println("事务执行过程中，命令进入队列，而没有被执行，所以/;0value为空:value=" + value);
            //此时List 会保存之前队列的所有命令的结果
            List list = ops.exec();//执行事务
            //事务结束后，获取value1；
            value=(String)redisTemplate.opsForValue().get("key1");
            return value;
        };
        //执行Redis的命令
        String value = (String) redisTemplate.execute(callback);
        System.out.println(value);
    }
}