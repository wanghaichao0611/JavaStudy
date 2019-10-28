package 使用Component注解装配Bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestbasePackages {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PojoConfig.class);
        Role role=context.getBean(Role.class);
        RoleService roleService=context.getBean(RoleServiceImpl.class);
        roleService.printRoleInfo(role);
        context.close();
    }
}
