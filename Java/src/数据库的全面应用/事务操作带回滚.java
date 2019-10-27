package 数据库的全面应用;
import java.sql.*;
public class 事务操作带回滚 {
    public static void main(String[] args)
    {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){System.out.println("第一个异常捕获并了!");}
        try
        {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/test?serverTimezone=UTC","root","whc19970611");
            stmt=conn.createStatement();
            conn.setAutoCommit(false);
            stmt.executeUpdate("insert into student values (7,'张三','男',20,'计算机')");
            stmt.executeUpdate("insert into student values (8,'李四','男',18,'会计')");
            stmt.executeUpdate("insert into student values (1,'王五','男',20,'金融')");
            conn.commit();
            conn.setAutoCommit(true);
        }catch (java.sql.SQLException e){
         e.printStackTrace();
            if (conn!=null)
            {
                try
                {
                    conn.rollback();
                }
                catch (java.sql.SQLException e1){System.out.println("第三个异常捕获了!");}
            }
        }
        finally {
            try
            {
                if (stmt!=null) stmt.close();
                if (conn!=null) conn.close();
            }catch (java.sql.SQLException e){System.out.println("第四个异常捕获了！");}
        }
    }
}
