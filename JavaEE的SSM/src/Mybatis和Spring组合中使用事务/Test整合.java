package Mybatis和Spring组合中使用事务;

import com.domain.TRole;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test整合 {
    @Test
    public void test()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Mybatis和Spring组合中使用事务/springmybatis.xml");
        TRoleServiceList tRoleServiceList=applicationContext.getBean(TRoleServiceList.class);
        List<TRole> roleList=new ArrayList<TRole>();
            TRole tRole=new TRole();
            tRole.setId(8L);
            tRole.setRoleName("李伟");
            tRole.setNote("丑");
            roleList.add(tRole);
        int count=tRoleServiceList.insertTRoleList(roleList);
        System.out.println(count);
    }
}
