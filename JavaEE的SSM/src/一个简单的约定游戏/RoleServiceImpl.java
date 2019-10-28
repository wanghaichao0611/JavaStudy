package 一个简单的约定游戏;

import org.springframework.stereotype.Component;
import 使用Component注解装配Bean.Role;
@Component
public class RoleServiceImpl implements RoleSecvice {
    @Override
    public void printRole(Role role) {
        System.out.println("id="+role.getId()+",roleName="+role.getRoleName()+",note="+role.getNote());
    }
}
