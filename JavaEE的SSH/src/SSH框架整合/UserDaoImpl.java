package SSH框架整合;

import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;


public class UserDaoImpl implements UserDao {
    //提供Hibernate模板
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
    {
        this.hibernateTemplate=hibernateTemplate;
    }
    @Override
    public WhcUserEnitity findOneid(Integer id) {
        return this.hibernateTemplate.get(WhcUserEnitity.class,id);
    }

    @Override
    public void save(WhcUserEnitity whcUserEnitity) {
        this.hibernateTemplate.save(whcUserEnitity);
    }

    @Override
    public void update(WhcUserEnitity whcUserEnitity) {
        this.hibernateTemplate.update(whcUserEnitity);
    }
    @Override
    public void delete(WhcUserEnitity whcUserEnitity) {
        this.hibernateTemplate.delete(whcUserEnitity);
    }
}
