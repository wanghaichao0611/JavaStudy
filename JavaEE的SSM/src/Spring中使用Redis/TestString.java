package Spring中使用Redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class TestString {
    @Test
    public void tetsSrting()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring中使用Redis/Spring.xml");
        RedisTemplate redisTemplate=applicationContext.getBean(RedisTemplate.class);
        //设值
        redisTemplate.opsForValue().set("key1","value1");
        redisTemplate.opsForValue().set("key2","value2");
        //通过key1获取值
        String value1=(String)redisTemplate.opsForValue().get("key1");
        System.out.println(value1);
        //通过key1删除值
        redisTemplate.delete("key1");
        //求长度
        Long length=redisTemplate.opsForValue().size("key2");
        System.out.println(length);
        //设置新值并返回旧值
        String oldValue2=(String)redisTemplate.opsForValue().getAndSet("key2","new_value2");
        System.out.println(oldValue2);
        //通过key2获取值
        String value2=(String)redisTemplate.opsForValue().get("key2");
        System.out.println(value2);
        //求字串
        String rangeValue2=redisTemplate.opsForValue().get("key2",0,3);
        System.out.println(rangeValue2);
        //追加字符串到末尾,返回新长度
        int newLen=redisTemplate.opsForValue().append("key2","_app");
        System.out.println(newLen);
        String appendValue2=(String)redisTemplate.opsForValue().get("key2");
        System.out.println(appendValue2);

    }
}
