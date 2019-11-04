package com.Config;


import feign.Contract;
import org.springframework.context.annotation.Bean;

/**该类为Feign的配置类，注意：该类可以不写@Configuration注解；如果加了@Configuration的注解,那么该类不能放在主应用程序
 * 上下文@CompomentScan所在的包中
 * **/

public class FeignConfiguration {
    /**
     * 将契约改为Feign原生的默认契约。这样就可以所以用feign自带的注解了。
     * @return 默认的feign契约
     * **/
    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }
}
