import java.sql.*;
public class 连接数据库并且输出 {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost/test?serverTimezone=UTC";//修改时区就可以防止报错；
    private static String user= "root";
    private static String password = "whc19970611";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        String sql = "Select id,name From 学生表";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString( "name");
            System.out.println(id + " " + name + " ");
        }
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }
}