package Mybatis和Spring组合中使用事务;

import com.domain.TRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TRoleServiceImpl implements TRoleService {
    @Autowired(required = true)
    private TRoleService tRoleMapper=null;
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int insertTRole(TRole tRole)
    {
        return tRoleMapper.insertTRole(tRole);
    }
}
