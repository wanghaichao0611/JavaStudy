package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Annotation装配.UserAction;
public class Annotation装配 {
    @Test
    public void annotationTest()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Annotation装配/Annotation装配.xml");
        UserAction userAction=(UserAction)applicationContext.getBean("userAction");
        System.out.println(userAction);
        userAction.save();
    }
}
