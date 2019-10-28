package cn.itcast.注册;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import cn.itcast.注册.公共的SessionFactory;
import cn.itcast.注册.Information;
import org.hibernate.Query;

public class 登录和注册的JavaBean {
    private Session session;
    private Transaction transaction;
    private Query query;
    公共的SessionFactory b;
    public 登录和注册的JavaBean()
    {}
    public String save(Information 用户名) {
        String mess = "error";
        b=new 公共的SessionFactory();
        try{
            transaction=session.beginTransaction();
            session.save(用户名);
            transaction.commit();
            mess="success";
            return mess;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public List queryInfo(String type,Object value){
        b=new 公共的SessionFactory();
        session=b.getSession();
        try{
            String hqlsql="from Information as u where u.用户名=?";
            query=session.createQuery(hqlsql);
            query.setParameter(0, value);
            List list=query.list();
            transaction=session.beginTransaction();
            transaction.commit();
            return list;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}


