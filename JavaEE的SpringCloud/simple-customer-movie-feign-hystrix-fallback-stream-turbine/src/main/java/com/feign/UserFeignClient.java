package com.feign;

import com.Entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign的fallback测试
 * 使用@FeignClient的fallback属性指定回退类
 * @author 周立
 */
@FeignClient(name = "whc-provider-user",fallback = FeignClientFallback.class)//用于创建Ribbon负载均衡器
public interface UserFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

}
    /**
     * 回退类FeignClientFallback需实现Feign Client接口
     * FeignClientFallback也可以是public class，没有区别
     * @author 周立
     */
    @Component
    class FeignClientFallback implements UserFeignClient {
        @Override
        public User findById(Long id) {
            User user=new User();
            user.setId(-1L);
            user.setName("默认用户");
            return user;
        }
    }
