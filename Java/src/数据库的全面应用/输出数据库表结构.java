package 数据库的全面应用;
import java.sql.*;
public class 输出数据库表结构 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) { System.out.println("求求你了，别让我再写这个了!"); }
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","whc19970611");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from student where object='计算机'");
            ResultSetMetaData rsMeteData = rs.getMetaData();
            System.out.println("总共有:" + rsMeteData.getColumnCount() + "列");
            for (int i = 1; i <= rsMeteData.getColumnCount(); i++) {
                System.out.println("列" + i + " " + rsMeteData.getColumnName(i) + "," + rsMeteData.getColumnTypeName(i) + "(" + rsMeteData.getColumnDisplaySize(i) + ")");

            }
        } catch (java.sql.SQLException e) {
            System.out.println("求求你，别错了!!!");
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (java.sql.SQLException e) {
                System.out.println("你告诉我我错哪里了?");
            }
        }
    }
}
