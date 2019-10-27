package 数据库的全面应用;
import java.sql.*;
public class 部分事务回滚
{
    public static void main(String[] args)
    {
        boolean k=true;
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){System.out.println("加载类的报错!");}
        try
        {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","whc19970611");
            stmt=conn.createStatement();
            conn.setAutoCommit(false);
            stmt.executeUpdate("insert into student values (1,'张三','男',20,'计算机')");
            Savepoint s1=conn.setSavepoint();
            stmt.executeUpdate("insert into student values (8,'李四','男',18,'会计')");
            stmt.executeUpdate("insert into student values (9,'王五','男',20,'金融')");
            if (k)
            {
                conn.rollback(s1);
            }
            conn.commit();
            conn.setAutoCommit(true);
        }
        catch (java.sql.SQLException e)
        {
            System.out.println("部分回滚成立，主键冲突错误都产生了。");
            if (conn!=null)
                try
                {
                    conn.rollback();
                }
            catch (java.sql.SQLException e1){e1.printStackTrace();}
        }
        finally {
            try
            {
                if (stmt!=null) stmt.close();
                if (conn!=null) conn.close();
            }catch (java.sql.SQLException e){}
        }
    }
}
