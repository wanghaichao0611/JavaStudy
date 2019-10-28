package XML的JDBC;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class XML {
    public static void main(String[] args) {
        SqlSessionFactory SqlSessionFactory = null;
        String resource = "properties文件和程序传递/MybatisGenerator.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("数据库连接成功!!!");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}