package 定义多个切面;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("定义多个切面")
public class MultiConfig {
    @Bean
    public Aspect1 getAspect1()
    {
        return new Aspect1();
    }
    @Bean
    public Aspect2 Aspect2()
    {
        return new Aspect2();
    }
    @Bean
    public Aspect3 Aspect3()
    {
        return new Aspect3();
    }
}
