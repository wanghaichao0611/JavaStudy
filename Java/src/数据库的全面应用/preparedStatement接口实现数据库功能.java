package 数据库的全面应用;
import java.sql.*;
public class preparedStatement接口实现数据库功能 {
    private static String selectsql="select * from student where object=?";
    private static String insertsql="insert into student values(?,?,?,?,?)";
    private static String updatesql="update student set object='金融' where sNo=?";
    private static String deletesql="delete from student where sNo=?";
    public static  void main(String[] args)
    {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){System.out.println("异常产生了。");}
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?serverTimezone=UTC", "root", "whc19970611");
            ps=conn.prepareStatement(selectsql);
            ps.setString(1,"计算机");
            rs=ps.executeQuery();
            while(rs.next())
            {
                String no=rs.getString("sNo");
                String name=rs.getString("sName");
                String sex=rs.getString("sex");
                String age=rs.getString("age");
                String object=rs.getString("object");
                System.out.println(no+" "+name+" "+sex+" "+age+" "+object+" ");
            }
            ps=conn.prepareStatement(insertsql);
            ps.setString(1,"6");
            ps.setString(2,"王毅");
            ps.setString(3,"男");
            ps.setString(4,"18");
            ps.setString(5,"外语");
            int count=ps.executeUpdate();
            System.out.println("添加"+count+"条记录到student表中");
            ps=conn.prepareStatement(updatesql);
            ps.setString(1,"2");
            count=ps.executeUpdate();
            System.out.println("修改了student表中的"+count+"条记录");
            ps=conn.prepareStatement(deletesql);
            ps.setString(1,"2");
            count=ps.executeUpdate();
            System.out.println("删除了student表中的"+count+"条记录");
        } catch (java.sql.SQLException e){ System.out.println("自己去检查!");}
        finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            }
            catch (java.sql.SQLException e){System.out.println("你报错你🐎呢!");}
        }
    }
}
