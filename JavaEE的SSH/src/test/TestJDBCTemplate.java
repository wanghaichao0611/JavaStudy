package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springJDBC.User;
import springJDBC.UserDao;

import java.util.List;

public class TestJDBCTemplate {
    @Test
    public void  addUserTest()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springJDBC/JdbcTemplate.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        User user=new User();
        user.setUserid(1);
        user.setUsername("Tom");
        user.setPassword("123");
        int flag=userDao.addUser(user);
        if (flag==1)
        {
            System.out.println("用户添加成功");
        }
        else {
            System.out.println("用户添加失败");
        }
    }
    @Test
    public void updateUserTest()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springJDBC/JdbcTemplate.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        User user=new User();
        user.setUserid(1);
        user.setUsername("Jerry");
        user.setPassword("666");
        int flag=userDao.updateUser(user);
        if (flag==1){
            System.out.println("修改用户成功");
        }
        else {
            System.out.println("修改用户失败");
        }
    }
    @Test
    public void deleteUserTest()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springJDBC/JdbcTemplate.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        int flag=userDao.deleteUser(1);
        if (flag==1){
            System.out.println("删除用户成功");
        }
        else {
            System.out.println("删除用户失败");
        }
    }
    @Test
    public void findOneUser()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springJDBC/JdbcTemplate.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        User user=userDao.单个查询方法(1);
        System.out.println(user);
    }
    @Test
    public void findAllUser()
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springJDBC/JdbcTemplate.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        List<User>user=userDao.全部查询方法();
        for (User u:user
             ) {
            System.out.println(u);
        }
    }
}
