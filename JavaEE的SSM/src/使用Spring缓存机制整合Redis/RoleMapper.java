package 使用Spring缓存机制整合Redis;
import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import 使用Spring缓存机制整合Redis.Role;
@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    Role selectByPrimaryKey(Long id);

    int updateRole(Role role);


}