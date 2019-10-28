package SSH框架整合;

import java.util.List;

public interface UserDao {
    public void save(WhcUserEnitity whcUserEnitity);
    public void update(WhcUserEnitity whcUserEnitity);
    public void delete(WhcUserEnitity whcUserEnitity);
    public WhcUserEnitity findOneid(Integer id);
}
