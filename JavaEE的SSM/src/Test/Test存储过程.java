package Test;

import com.domain.PdCountRoleParams;
import com.mapper.TRoleMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import 基本配置SqlSessionFactory.SqlSessionFactoryUtils;

public class Test存储过程 {
    @Test
    public void test()
    {
        PdCountRoleParams params=new PdCountRoleParams();
        SqlSession sqlSession=null;
        try
        {
            Logger logger=Logger.getLogger(Test存储过程.class);
            sqlSession=SqlSessionFactoryUtils.opensqlSession();
            TRoleMapper tRoleMapper=sqlSession.getMapper(TRoleMapper.class);
            params.setRoleName("赵");
            tRoleMapper.countRole(params);
            logger.info(params.getTotal());
            logger.info(params.getExecDate());
        }catch (Exception e){e.printStackTrace();}
        finally {
            if (sqlSession != null)
            {
                sqlSession.close();
            }
        }
    }
}
