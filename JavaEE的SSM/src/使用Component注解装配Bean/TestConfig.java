package 使用Component注解装配Bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
    public static void main(String[] args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(PojoConfig.class);
        Role role=context.getBean(Role.class);
        System.err.println(role.getId());
    }
}
