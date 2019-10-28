package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Hibernate.Customer;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import cn.itcast.注册.公共的SessionFactory;
public class CustomerTest {
    @Rollback(false)
    @Test
    public void insertTest()
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Customer c=new Customer();
        c.setId(1);
        c.setName("王五");
        c.setAge(20);
        c.setCity("上海");
        c.setSex("男");
        session.save(c);
        t.commit();
        session.close();
        sessionFactory.close();
    }
    @Test
    public void updateTest()
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Customer c=new Customer();
        c.setId(1);
        c.setName("李四");
        c.setAge(20);
        c.setSex("女");
        c.setCity("广州");
        session.update(c);
        t.commit();
        session.close();
        sessionFactory.close();
    }
    @Test
    public void selectTest()
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Customer c=(Customer)session.get(Customer.class,1);
        System.out.println("姓名:"+c.getName());
        System.out.println("年龄:"+c.getAge());
        System.out.println("性别:"+c.getSex());
        System.out.println("城市:"+c.getCity());
        t.commit();
        session.close();
        sessionFactory.close();
    }
    @Test
    public void deleteTes()
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Customer c=(Customer)session.get(Customer.class,1);
        session.delete(c);
        t.commit();
        session.close();
        sessionFactory.close();
    }
    @Test
    public void select1()
    {
        Session session=公共的SessionFactory.getSession();
        session.beginTransaction();
        Customer book=new Customer();
        book.setId(1);
        book.setName("汪海潮");
        book.setSex("男");
        book.setAge(20);
        book.setCity("郑州");
        session.update(book);
        session.getTransaction().commit();
        session.close();
        System.out.println(book);
    }

}

