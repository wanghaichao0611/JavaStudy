package 数据库的全面应用;
import java.sql.*;
public class Callstatement接口实现调用存储过程 {
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");}
        catch (ClassNotFoundException e){e.printStackTrace();}
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "whc19970611");
            cs = conn.prepareCall("call addStudent(?,?,?,?,?)");
            cs.setString(1,"6");
            cs.setString(2,"王毅");
            cs.setString(3,"男");
            cs.setInt(4,18);
            cs.setString(5,"外语");
            cs.execute();
            cs=conn.prepareCall("call getCount(?)");
            cs.registerOutParameter(1,java.sql.Types.INTEGER);
            cs.execute();
            int total=cs.getInt(1);
            System.out.println("总人数为: "+total);
            int a=5;
            int b=3;
            cs=conn.prepareCall("call addSub(?,?)");
            cs.setInt(1,a);
            cs.setInt(2,b);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            int sunm=cs.getInt(1);
            int sub=cs.getInt(2);
            System.out.println(a+"与"+b+"的和:"+sunm+",差:"+sub);
        }
        catch (java.sql.SQLException e){e.printStackTrace();}
        finally
        {
            try
            {
                if(cs!=null) cs.close();
                if(conn!=null) conn.close();
            }
            catch(java.sql.SQLException e){e.printStackTrace();}
        }
    }
}