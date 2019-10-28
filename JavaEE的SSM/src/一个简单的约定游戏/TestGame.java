package 一个简单的约定游戏;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import 使用Component注解装配Bean.PojoConfig;
import 使用Component注解装配Bean.Role;

public class TestGame {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(PojoConfig.class);
        RoleSecvice roleSecvice=new RoleServiceImpl();
        Interceptor interceptor=new RoleInterceptor();
        RoleSecvice proxy=ProxyBeanFactory.getBean(roleSecvice,interceptor);
        Role role=annotationConfigApplicationContext.getBean(Role.class);
        proxy.printRole(role);
        System.out.println("测试方法！！！");
        role=null;
        proxy.printRole(role);
    }
}
