package 基本配置SqlSessionFactory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private final static Class<SqlSessionFactoryUtils> LOCK=SqlSessionFactoryUtils.class;
    private static SqlSessionFactory sqlSessionFactory=null;
    private SqlSessionFactoryUtils(){}
    private static SqlSessionFactory getSqlSessionFactory()
    {
        synchronized (LOCK){
            if (sqlSessionFactory !=null){
                return sqlSessionFactory;
            }
            String resource="基本配置SqlSessionFactory/MybatisGenerator.xml";
            InputStream inputStream;
            try{
                inputStream= Resources.getResourceAsStream(resource);
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            }
            catch (IOException e){
                e.printStackTrace();
                return null;
            }
            return sqlSessionFactory;
        }
    }
    public static SqlSession opensqlSession()
    {
        if (sqlSessionFactory==null){
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
