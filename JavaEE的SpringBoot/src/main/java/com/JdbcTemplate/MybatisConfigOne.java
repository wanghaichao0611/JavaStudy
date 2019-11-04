package com.JdbcTemplate;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.Mapper.Mapper1",sqlSessionFactoryRef = "sqlSessionFactoryBean1")
public class MybatisConfigOne {
    @Autowired
    @Qualifier("dsOne")
    DataSource dataSource;
    @Bean
    SqlSessionFactory sqlSessionFactoryBean1() throws Exception{
        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }
    @Bean
    SqlSessionTemplate sqlSessionTemplate1() throws Exception{
        return new SqlSessionTemplate(sqlSessionFactoryBean1());
    }

}
