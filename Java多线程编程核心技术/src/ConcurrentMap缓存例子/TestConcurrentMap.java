package ConcurrentMap缓存例子;


import 生产者消费者模式.C;

import java.util.concurrent.ConcurrentHashMap;

/**ConcurrentHashMap和Hashtable都是线程安全的，但HashTable读写操作会阻塞锁,
 * 而ConcurrentHashMap不会锁住整个Map,只是把Map中正在被写入的部分锁定，性能上
 * 优于HashTable.
 * **/
class Cache{
    private ConcurrentHashMap<String,Object> map;
    public Cache(){
        map=new ConcurrentHashMap<String, Object>();
    }
    public Object put(String key,Object value){
        return map.put(key, value);
    }
    public Object get(String key){
        return map.get(key);
    }
}
public class TestConcurrentMap {
    public static void main(String[] args){
        Cache cache=new Cache();
        cache.put("person","王蒙");
        String name=(String)cache.get("person");
        System.out.println(name);
    }

}
