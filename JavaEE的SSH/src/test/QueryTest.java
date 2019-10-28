package test;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Hibernate.Customer;
import org.hibernate.Query;
import org.junit.Test;
public class QueryTest {
    @Test
    public void Queryselect()
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        String HQL="from Customer";
        Query query=session.createQuery(HQL);
        List<Customer> list= query.list();
        for (Customer c: list){
            System.out.println(c);
        }
        t.commit();
        session.close();
        sessionFactory.close();
  }
}
