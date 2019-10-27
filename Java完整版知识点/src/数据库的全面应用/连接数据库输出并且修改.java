import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class 连接数据库输出并且修改 {
    public static void main(String[] args) {
        String selectsql = "select * from student where object='计算机'";
        String insertsql = "insert into student(sNo,sName,sex,age,object)" + "values(6,'王毅','男',18,'外语')";
        String updatesql = "update student set object='金融'where sNo=4";
        String delectsql = "delete from student where sNo=5";
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) { e.printStackTrace();}
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?serverTimezone=UTC", "root", "whc19970611");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(selectsql);
            while (rs.next()) {
                int no = rs.getInt("sNo");
                String name = rs.getString("sName");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                String object = rs.getString("object");
                System.out.println(no + " " + name + " " + sex + " " + age + " " + object);
            }
            int count = stmt.executeUpdate(insertsql);
            System.out.println("添加" + count + "条纪律到student表中");
            count = stmt.executeUpdate(updatesql);
            System.out.println("修改了student表中" + count + "条记录");
            count = stmt.executeUpdate(delectsql);
            System.out.println("删除了student" + count + "条记录");
        } catch (java.sql.SQLException e) { e.printStackTrace(); }
        finally {
            try{
                if (rs!=null) rs.close();
                if (stmt!=null) stmt.close();
                if (conn!=null) conn.close();
            }
            catch(java.sql.SQLException e){ e.printStackTrace();}
        }
    }
}