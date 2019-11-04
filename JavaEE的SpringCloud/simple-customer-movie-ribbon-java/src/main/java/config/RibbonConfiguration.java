package config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**该类为Ribbon的配置类：必须注意的是本例中的RibbonConfigurate类不能存放在主应用程序上下文的@CompomentScan所扫描的包中,
 * 否则该类中的配置信息将被所有的@RibbonClient共享。因此，如果指向自定义某一个Ribbon客户端的配置，必须防止@Configuration
 * 注意的类所在的包与@CompomentScan 扫描的包重叠，或应该显式指定@Compoment不能扫描@Configuration类所在的包.
 * **/
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        //负载均衡规则，改为随机
        return new RandomRule();
    }
}
