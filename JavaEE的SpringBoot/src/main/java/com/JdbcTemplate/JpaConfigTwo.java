package com.JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.dao2",entityManagerFactoryRef = "entityManagerFactoryBeanTwo",transactionManagerRef = "platformTransactionManagerTwo")
public class JpaConfigTwo {
    @Resource(name = "dsTwo")
    DataSource dsTwo;
    @Autowired
    JpaProperties jpaProperties;
    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactoryBeanTwo(EntityManagerFactoryBuilder builder){
        return builder.dataSource(dsTwo).properties(jpaProperties.getProperties()).packages("com.entity")
                .persistenceUnit("pu2").build();
    }
    @Bean
    PlatformTransactionManager platformTransactionManagerTwo(EntityManagerFactoryBuilder builder){
        LocalContainerEntityManagerFactoryBean factoryTwo=entityManagerFactoryBeanTwo(builder);
        return new JpaTransactionManager(factoryTwo.getObject());
    }
}