package Mybatis整合Spring;

import com.domain.TRole;
import com.mapper.TRoleMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSM {
    @Test
    public void test()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybatis整合Spring/SqlSessionFactoryBean.xml");
        TRoleMapper tRoleMapper=ctx.getBean(TRoleMapper.class);
        TRole tRole=new TRole();
        tRole.setRoleName("李佳峰");
        tRole.setNote("丑");
        tRoleMapper.insert(tRole);
    }
}
