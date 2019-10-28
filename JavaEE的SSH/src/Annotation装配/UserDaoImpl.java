package Annotation装配;

import org.springframework.stereotype.Repository;
 @Repository("userDao")//<bean id="userDao class="文件路径位置"></bean>
public class UserDaoImpl implements userDao{
     public  void save()
     {
         System.out.println("Annotation的装配已经完成（DAO）!");
     }
}
