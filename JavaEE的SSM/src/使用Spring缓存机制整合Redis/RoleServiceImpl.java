package 使用Spring缓存机制整合Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements RoleService {
    //角色DAO，方便执行SQL
    @Autowired
    private RoleMapper roleMapper=null;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    @Cacheable(value = "redisCacheManager",key = "'redis_role_'+#id")
    public Role getRole(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    @CachePut(value = "redisCacheManager",key = "'redis_role_'+#result.id")
    public Role insertRole(Role role) {
        roleMapper.insert(role);
        return role;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    @CacheEvict(value = "redisCacheManager",key = "'redis_role_'+#role.id")
    public Role updateRole(Role role) {
        roleMapper.updateRole(role);
        return role;
    }
}
