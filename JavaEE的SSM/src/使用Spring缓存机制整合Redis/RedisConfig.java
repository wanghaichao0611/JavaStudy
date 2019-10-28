package 使用Spring缓存机制整合Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableCaching
public class RedisConfig {
    @Bean(name = "redisTemplate")
    public RedisTemplate initRedisTemplate()
    {
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        //最大空闲数
        poolConfig.setMaxIdle(50);
        //最大连接数
        poolConfig.setMaxTotal(100);
        //最大等待毫秒数
        poolConfig.setMaxWaitMillis(20000);
        //创建Jedis连接工厂
        JedisConnectionFactory connectionFactory=new JedisConnectionFactory(poolConfig);
        connectionFactory.setHostName("localhost");
        connectionFactory.setPort(6379);
        //调用后初始化方法，没有将他抛出异常
        connectionFactory.afterPropertiesSet();
        //自定义Redis序列化器
        RedisSerializer jdk=new JdkSerializationRedisSerializer();
        RedisSerializer str=new StringRedisSerializer();
        //定义RedisTemplate，并设置连接工程
        RedisTemplate redisTemplate=new RedisTemplate();
        redisTemplate.setConnectionFactory(connectionFactory);
        //设置序列化器
        redisTemplate.setDefaultSerializer(str);
        redisTemplate.setKeySerializer(str);
        redisTemplate.setValueSerializer(jdk);
        redisTemplate.setHashKeySerializer(str);
        redisTemplate.setHashValueSerializer(jdk);
        return redisTemplate;
    }
    @Bean(name = "redisCacheManager")
    public CacheManager initRedisCacheManager(@Autowired RedisTemplate redisTemplate)
    {
        RedisCacheManager cacheManager=new RedisCacheManager(redisTemplate);
        //设置超时时间为十分钟，单位为秒
        cacheManager.setDefaultExpiration(600);
        //设置缓存名字
        List<String> cacheNames=new ArrayList<String>();
        cacheNames.add("redisCacheManager");
        cacheManager.setCacheNames(cacheNames);
        return cacheManager;
    }
}
