package 控制器接受各种请求参数;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import 分页参数RowBounds.RowBounds;
@Mapper
public interface RoleMapper{
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Role record);

    List<Role> selectAllByIdBetween(@Param("minId")Long minId,@Param("maxId")Long maxId);
    List<Role> findByRowBounds(@Param("roleName") String rolename, @Param("note")String note, RowBounds rowBounds);
    Role findById(@Param("id")Long id);

}