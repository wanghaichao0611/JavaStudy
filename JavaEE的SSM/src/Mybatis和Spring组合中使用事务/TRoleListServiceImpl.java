package Mybatis和Spring组合中使用事务;

import com.domain.TRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TRoleListServiceImpl implements TRoleServiceList {
    @Autowired(required = true)
    private TRoleService tRoleService=null;
    Logger log=Logger.getLogger(TRoleListServiceImpl.class);
    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public int insertTRoleList(List<TRole> roleList)
    {
        int count=0;
        for (TRole tRole:roleList){
            try
            {
                count+=tRoleService.insertTRole(tRole);
            }catch (Exception e){log.info(e);}
        }
        return count;
    }
}
