package Annotation装配;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import Annotation装配.userDao;
@Service("userService")//<bean id="userService" class="文件路径位置// "></bean>
public class UserserviceImpl implements Userservice {
    @Resource(name = "userDao")//<bean id="userService" class="文件路径位置"><property name="userDao" ref="userDao"></property></bean>
    private userDao userDao;
    //userDao的set方法//
    public void setUserDao(userDao userDao)
    {
        this.userDao=userDao;
    }
    public void save()
    {
        this.userDao.save();
        System.out.println("Annotation的装配已经完成（SERVICE）!");
    }
}
