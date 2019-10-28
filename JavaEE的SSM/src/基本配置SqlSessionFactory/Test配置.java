package 基本配置SqlSessionFactory;

import 控制器接受各种请求参数.Role;
import 控制器接受各种请求参数.RoleMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


public class Test配置 {
    @Test
    public void test()
    {
       Logger logger=Logger.getLogger(Test配置.class);
        SqlSession sqlSession=null;
        try{
            sqlSession=SqlSessionFactoryUtils.opensqlSession();
            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
            Role role=roleMapper.selectByPrimaryKey(1L);
            logger.info(role.getRoleName());
            logger.info(role.getNote());
        }
        finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
