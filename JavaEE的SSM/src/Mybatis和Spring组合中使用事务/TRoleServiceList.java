package Mybatis和Spring组合中使用事务;

import com.domain.TRole;

import java.util.List;

public interface TRoleServiceList {
    public int insertTRoleList(List<TRole> roleList);
}
