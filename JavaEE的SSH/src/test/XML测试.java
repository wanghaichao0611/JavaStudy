package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XML测试 {
    @Test
    public void XML测试方法()
    {
        String xmlPatth="Bean装配方式/XML装配.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPatth);
        System.out.println(applicationContext.getBean("XML1"));
        System.out.println(applicationContext.getBean("XML2"));
    }
}
