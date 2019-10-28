package test;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring测试.hello;
import spring测试.two;
public class 测试Spring {
    @Test
    public void demo01()
    {
        String xmlPatth="applicationContext.xml";//定义配置路径
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPatth);//初始化Spring容器和加载配置文件
        hello he=(hello)((ClassPathXmlApplicationContext) applicationContext).getBean("hello");//通过容器获取接口实例
        he.save();//调用方法
    }
    @Test
    public void demo02()
    {
        String xmlPatth="applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPatth);
        two tw=(two)((ClassPathXmlApplicationContext)applicationContext).getBean("two");
        tw.save2();
    }
}
