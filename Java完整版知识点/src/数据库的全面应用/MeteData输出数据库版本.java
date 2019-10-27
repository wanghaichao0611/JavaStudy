package 数据库的全面应用;
import java.sql.*;
public class MeteData输出数据库版本 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("求求你了，别让我再写这个了!");
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "whc19970611");
            DatabaseMetaData dmd = conn.getMetaData();
            System.out.println("当前的用户名:" + dmd.getUserName());
            System.out.println("数据库产品:" + dmd.getDatabaseProductName());
            System.out.println("数据库版本;" + dmd.getDatabaseProductVersion());
            System.out.println("驱动程序名称:" + dmd.getDriverName());
            System.out.println("驱动程序版本号:" + dmd.getDriverVersion());
            System.out.println("数据库URL:" + dmd.getURL());
            System.out.println("是否支持外部连接:" + dmd.supportsOuterJoins());
            System.out.println("是否支持存储过程:" + dmd.supportsStoredProcedures());
            System.out.println("数据库中的所有支持数据类型的描述:" + dmd.getTypeInfo());
        } catch (java.sql.SQLException e) {
            System.out.println("捕获到了异常!");
        }
    }
}