package Spring中使用Redis;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class TestRedis {
    @Test
    public void test1()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring中使用Redis/Spring.xml");
        RedisTemplate redisTemplate=applicationContext.getBean(RedisTemplate.class);
        Role role=new Role();
        role.setId(1L);
        role.setRoleName("role_name_1");
        role.setNote("note_1");
        redisTemplate.opsForValue().set("role_1",role);
        Role role1=(Role)redisTemplate.opsForValue().get("role_1");
        System.out.println(role1.getRoleName());
    }
}
