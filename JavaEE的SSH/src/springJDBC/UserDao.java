package springJDBC;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(int id);
    public User 单个查询方法(int id);
    public List<User> 全部查询方法();
}
