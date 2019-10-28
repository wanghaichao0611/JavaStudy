package Bean;
import javax.print.attribute.standard.NumberUp;
import java.sql.*;
public class 数据库的连接 {
   private String driveName="com.mysql.cj.jdbc.Driver";
   private String  url="jdbc:mysql:localhost:3306/(每调用一次需要改一次)";
   private String user="root";
   private String password="whc19970611";
   public void setDriverName(String newDriverName)
   {
       driveName=newDriverName;
   }
   public String getDriveName()
    {
        return driveName;
    }
    public void setUrl(String newUrl)
    {
        url=newUrl;
    }
    public String getUrl()
    {
        return url;
    }
    public void setUser(String newUser)
    {
        user=newUser;
    }
    public String getUser()
    {
        return user;
    }
    public void setPassword(String newPassword)
    {
        password=newPassword;
    }
    public String getPassword()
    {
        return password;
    }
    public Connection getConnection()
    {
        try
        {
            Class.forName(driveName);
            return DriverManager.getConnection(url,user,password);
        }catch (Exception e){e.printStackTrace();}
        return null;
    }
}
