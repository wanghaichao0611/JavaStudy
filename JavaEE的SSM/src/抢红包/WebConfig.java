package 抢红包;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@Configuration
//定义Spring MVC扫描的包
@ComponentScan(value = "抢红包",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
//启动Spring MVC配置
@EnableWebMvc
public class WebConfig extends AsyncConfigurerSupport {
    //通过注解@bean初始化视图解析器，返回ViewResolver视图解析器
    @Bean(name = "internalResourceViewResolver")
    public ViewResolver initViewResolver()
    {
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/JSP");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    //初始化RequestMappingHandlerAdapter，并且加载Http的Json转换器，返回RequestMappingHandleAdapter对象
    @Bean(name = "requestMappingHandlerAdapter")
    public HandlerAdapter initHandlerAdapter()
    {
        //创建requestMappingHandlerAdapter适配器
        RequestMappingHandlerAdapter rmhd=new RequestMappingHandlerAdapter();
        //HTTP JSON转换器
        MappingJackson2HttpMessageConverter jsonConverter=new MappingJackson2HttpMessageConverter();
        //MappingJackson2HttpMessageConverter接受JSON类型消息转换
        MediaType mediaType=MediaType.APPLICATION_JSON_UTF8;
        List<MediaType>mediaTypes=new ArrayList<MediaType>();
        mediaTypes.add(mediaType);
        //加入转换器的支持类型
        jsonConverter.setSupportedMediaTypes(mediaTypes);
        //往适配器加入JSON转换器
        rmhd.getMessageConverters().add(jsonConverter);
        return rmhd;
    }

    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(200);
        taskExecutor.initialize();
        return taskExecutor;
    }
}
