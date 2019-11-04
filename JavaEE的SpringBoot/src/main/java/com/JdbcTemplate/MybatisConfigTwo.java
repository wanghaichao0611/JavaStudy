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
@MapperScan(value = "com.Mapper.Mapper2",sqlSessionFactoryRef = "sqlSessionFactoryBean2")
public class MybatisConfigTwo {
    @Autowired
    @Qualifier("dsTwo")
    DataSource dataSource;
    @Bean
    SqlSessionFactory sqlSessionFactoryBean2() throws Exception{
        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }
    @Bean
    SqlSessionTemplate sqlSessionTemplate2() throws Exception{
        return new SqlSessionTemplate(sqlSessionFactoryBean2());
    }

}