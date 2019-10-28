package Redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestRedis {
    @Test
    public void testRedis()
    {
        Jedis jedis=new Jedis("192.168.242.1",6379);//连接Redis//jedis.auth("password")如果需要密码
        int i=0;//记录操作次数
        try {
            long start = System.currentTimeMillis();//开始毫秒数
            while (true)
            {
                long end=System.currentTimeMillis();
                if (end-start>=1000){
                    break;//当大于等于1000毫秒（相当于1秒）时，结束才做
                }
                i++;
                jedis.set("test"+i,i+"");
            }
        }
        finally {
            jedis.close();//关闭连接
        }
        System.out.println("redis每秒操作:"+i+"次");//打印1秒内Redis的操作次数
    }
}
