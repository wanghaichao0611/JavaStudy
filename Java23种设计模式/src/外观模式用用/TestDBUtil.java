package 外观模式用用;

import java.sql.ResultSet;
import java.sql.SQLException;

//测试
public class TestDBUtil {
    public static void main(String[] args) {
        //添加
        DBUtil db = new DBUtil();
        String sql = "insert into 学生表 values(4,'赵亮')";
        db.executeUpdate(sql);

        //修改
        sql = "update 学生表 set name='李哥' where id=4";
        db.executeUpdate(sql);

        //查询
        sql = "select * from 学生表";
        ResultSet rs = db.executeQuery(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + "," + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.DBClose();
        }

        //删除
        sql = "delete from 学生表 where id=3";
        db.executeUpdate(sql);
    }
}