package cn.itcast.JDK动态代理;

import org.springframework.stereotype.Repository;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save()
    {
        System.out.println("save添加用户");
    }
    public void update()
    {
        System.out.println("update修改用户");
    }
    public void delete()
    {
        System.out.println("delete删除用户");
    }
    public void find()
    {
        System.out.println("find查询用户");
    }
}
