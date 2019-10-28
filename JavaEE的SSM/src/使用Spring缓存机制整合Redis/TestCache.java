package 使用Spring缓存机制整合Redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCache {
    @Test
    public void test()
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(RootConfig.class);
        //获取角色服务类
        RoleService roleService=applicationContext.getBean(RoleService.class);
        Role role=new Role();
        role.setRoleName("赵亮");
        role.setNote("丑");
        //插入角色
        roleService.insertRole(role);
        //获取角色
        Role getRole=roleService.getRole(role.getId());
        getRole.setNote("李一");
        //更新角色
        roleService.updateRole(getRole);
    }

}
