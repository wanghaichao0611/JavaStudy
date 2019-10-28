package Spring中使用Redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;

public class TestSessionCallback {
    @Test
    public void Test()
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring中使用Redis/Spring.xml");
        RedisTemplate redisTemplate=applicationContext.getBean(RedisTemplate.class);
        Role role=new Role();
        role.setId(1L);
        role.setRoleName("role_name_1");
        role.setNote("role_note_1");
        SessionCallback callback=new SessionCallback<Role>() {
            @Override
            public Role execute(RedisOperations redisOperations) throws DataAccessException {
                redisOperations.boundValueOps("role_1").set(role);
                return (Role)redisOperations.boundValueOps("role_1").get();
            }
        };
        Role savedRole=(Role)redisTemplate.execute(callback);
        System.out.println(savedRole.getId());
    }
}
