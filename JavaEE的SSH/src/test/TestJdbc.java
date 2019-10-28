package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class TestJdbc {
    @Test
    public void demo测试() {
        //定义配置文件路径
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springJDBC/JdbcTemplate.xml");
        //获取jdbcTemplate实例
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        //使用execute方法执行SQL语句，创建数据表
        jdbcTemplate.execute("create table whc_user("+"userid int primary key ,"+"username varchar(20),"+"password varchar(20))");
    }
}