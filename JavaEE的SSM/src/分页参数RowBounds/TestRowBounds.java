package 分页参数RowBounds;

import 控制器接受各种请求参数.Role;
import 控制器接受各种请求参数.RoleMapper;
import org.apache.ibatis.session.SqlSession;
import 基本配置SqlSessionFactory.SqlSessionFactoryUtils;

import java.util.List;


public class TestRowBounds {
    public static void main(String[] args) {
        {
            SqlSession sqlSession = null;
            try {
                sqlSession = SqlSessionFactoryUtils.opensqlSession();
                RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
                RowBounds rowBounds = new RowBounds(0, 20);
                List<Role> roleList = roleMapper.findByRowBounds("赵", "丑", rowBounds);
                System.err.println(roleList.size());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (sqlSession != null) {
                    sqlSession.close();
                }
            }
        }
    }
}