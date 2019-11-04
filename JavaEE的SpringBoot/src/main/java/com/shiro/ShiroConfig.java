package com.shiro;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.TextConfigurationRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
    @Bean
    public Realm realm(){
        TextConfigurationRealm realm=new TextConfigurationRealm();
        realm.setUserDefinitions("wang=123,user\n admin=123,admin");
        realm.setRoleDefinitions("admin=read,write\n user=read");
        return realm;
    }
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition(){
        DefaultShiroFilterChainDefinition chainDefinition=new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/login","anon");
        chainDefinition.addPathDefinition("/doLogin","anon");
        chainDefinition.addPathDefinition("/logout","logout");
        chainDefinition.addPathDefinition("/**","authc");
        return chainDefinition;
    }
    @Bean//若是不在thymeleaf中使用shiro标签，可以不使用ShiroDialect
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }
}
