package cn.itcast.注册;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import cn.itcast.注册.Information;
import org.hibernate.Query;

public class 保存 {
    public void insert()
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Information c=new Information();
        c.get用户名();
        c.get密码();
        c.get邮箱();
        c.get电话();
        session.save(c);
        t.commit();
        session.close();
        sessionFactory.close();
    }
}
