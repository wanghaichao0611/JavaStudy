package springJDBC;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

//userDao的实现类
public class UserDaoImpl implements UserDao {
    //定义Jdbctemplate属性机器getter方法和setter方法
    private JdbcTemplate jdbcTemplate;
    public  JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
    //添加用户
    public int addUser(User user)
    {
        //定于SQL语句
        String sql="insert into whc_user values(?,?,?)";
        //存放SQL语句的参数
        Object[] object=new Object[]
                {
                       user.getUserid(),
                       user.getUsername(),
                       user.getPassword()
                };
        //获取返回结果
        int flag=this.jdbcTemplate.update(sql,object);
        return flag;
    }
    //更新用户数据
    public int updateUser(User user)
    {
        String sql="update whc_user set userid=?"+",username=?"+",password=?";
        Object[] params=new Object[]{user.getUserid(),user.getUsername(),user.getPassword()};
        int flag=this.jdbcTemplate.update(sql,params);
        return flag;
    }

    public int deleteUser(int id)
    {
        String sql="delete from whc_user where userid=?";
        int flag=this.jdbcTemplate.update(sql,id);
        return flag;
    }
    public User 单个查询方法(int id)
    {
        String sql="select * from whc_user where userid=?";
        //将结果集通过Java放射机制映射到Java对象中
        RowMapper<User>rowMapper= BeanPropertyRowMapper.newInstance(User.class);
        //使用queryForObject()方法查询,返回单行记录
        return this.jdbcTemplate.queryForObject(sql,rowMapper,id);
    }
    public List<User> 全部查询方法()
    {
        String sql="select * from whc_user";
        RowMapper<User>rowMapper=BeanPropertyRowMapper.newInstance(User.class);
        //使用query()方法执行查询，并返回一个集合
        return this.jdbcTemplate.query(sql,rowMapper);
    }
}
