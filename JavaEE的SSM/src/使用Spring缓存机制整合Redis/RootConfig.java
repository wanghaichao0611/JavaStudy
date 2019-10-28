package 使用Spring缓存机制整合Redis;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
//定义Spring扫描的包
@ComponentScan("使用Spring缓存机制整合Redis")
//使用事务驱动管理器
@EnableTransactionManagement
//实现接口TransactionManagementConfigurer，这样可以配置注解驱动事务
public class RootConfig  implements TransactionManagementConfigurer {
    private DataSource dataSource=null;
    @Bean(name = "dataSource")//配置数据库和数据连接池
    public DataSource initDataSource()
    {
        if (dataSource !=null){
            return dataSource;
        }
        Properties pops=new Properties();
        pops.setProperty("driverClassName","com.mysql.cj.jdbc.Driver");
        pops.setProperty("url","jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC");
        pops.setProperty("username","root");
        pops.setProperty("password","whc19970611");
        try{
            dataSource= BasicDataSourceFactory.createDataSource(pops);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }
    //配置SqlSessionFactoryBean
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean initSqlSessionFactory()
    {
        SqlSessionFactoryBean sqlSessionFactory=new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(initDataSource());
        //配置Mybatis配置文件
        Resource resource=new ClassPathResource("使用Spring缓存机制整合Redis/mybatis.xml");
        sqlSessionFactory.setConfigLocation(resource);
        return sqlSessionFactory;
    }
    //通过自动扫描，发现Mybatis Mapper接口
    @Bean
    public MapperScannerConfigurer initMapperScannerConfigurer()
    {
        MapperScannerConfigurer msc=new MapperScannerConfigurer();
        //扫描包
        msc.setBasePackage("使用Spring缓存机制整合Redis");
        msc.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //区分注解扫描包
        msc.setAnnotationClass(Repository.class);
        return msc;
    }
    //实现接口方法,注册注解事务，当@Transactional使用的时候产生数据库事务
    @Bean(name = "annotationDrivenTransactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager()
    {
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
        transactionManager.setDataSource(initDataSource());
        return transactionManager;
    }
}
