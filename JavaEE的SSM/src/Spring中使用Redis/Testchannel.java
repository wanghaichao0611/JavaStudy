package Spring中使用Redis;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class Testchannel {
    @Test
    public void test()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring中使用Redis/Spring.xml");
        RedisTemplate redisTemplate=applicationContext.getBean(RedisTemplate.class);
        String channel="chat";
        redisTemplate.convertAndSend(channel,"I am lazy!!");
    }
}
