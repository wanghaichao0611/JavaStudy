package 外观模式用用;



import java.sql.*;
import java.util.Date;

//封装 JDBC DBUtil类
public class DBUtil {
    protected Connection connection;
    private Statement statement;

    public DBUtil() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //打开连接
    public Connection openConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "whc19970611");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //执行 添加 删除 修改
    public boolean executeUpdate(String sql) {
        connection = openConnection();
        //执行sql语句
        try {
            Statement statement = connection.createStatement();
            if (statement.executeUpdate(sql) > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    //预编译 添加 删除 修改
    public boolean executeUpdate(String sql, Object[] params) {
        connection = openConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; params != null && i < params.length; i++) {
                Object param = params[i];
                if (param instanceof Integer) {
                    preparedStatement.setInt(i + 1, Integer.parseInt(param.toString()));
                }
                if (param instanceof Float) {
                    preparedStatement.setFloat(i + 1, Float.parseFloat(param.toString()));
                }
                if (param instanceof Double) {
                    preparedStatement.setDouble(i + 1, Double.parseDouble(param.toString()));
                }
                if (param instanceof String) {
                    preparedStatement.setString(i + 1, param.toString());
                }
                if (param instanceof Date) {
                    java.util.Date date = (java.util.Date) param;
                    preparedStatement.setTimestamp(i + 1, new Timestamp(date.getTime()));
                }
            }
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose();
        }
        return false;
    }

    //预编译 查询
    //select * from book where id=?
    public ResultSet executeQuery(String sql, Object[] params) {
        connection = openConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; params != null && i < params.length; i++) {
                Object param = params[i];
                if (param instanceof Integer) {
                    preparedStatement.setInt(i + 1, Integer.parseInt(param.toString()));
                }
                if (param instanceof Float) {
                    preparedStatement.setFloat(i + 1, Float.parseFloat(param.toString()));
                }
                if (param instanceof Double) {
                    preparedStatement.setDouble(i + 1, Double.parseDouble(param.toString()));
                }
                if (param instanceof String) {
                    preparedStatement.setString(i + 1, param.toString());
                }
                if (param instanceof Date) {
                    java.util.Date date = (java.util.Date) param;
                    preparedStatement.setTimestamp(i + 1, new Timestamp(date.getTime()));
                }
            }
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //执行 查询
    public ResultSet executeQuery(String sql){
        connection=openConnection();
        try{
            Statement statement=connection.createStatement();
            return statement.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    //关闭连接
    public void DBClose(){
        if (connection!=null){
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}