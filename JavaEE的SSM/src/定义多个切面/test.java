package 定义多个切面;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    @Test
    public void test1()
    {
        ApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MultiConfig.class);
        MultiBean multiBean=annotationConfigApplicationContext.getBean(MultiBean.class);
        multiBean.testMulti();
    }
}
