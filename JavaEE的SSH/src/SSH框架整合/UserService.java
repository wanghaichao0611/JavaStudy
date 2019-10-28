package SSH框架整合;

public interface UserService {
    public void saveUser(WhcUserEnitity whcUserEnitity);
    public void updateUser(WhcUserEnitity whcUserEnitity);
    public void deleteUser(WhcUserEnitity whcUserEnitity);
    public WhcUserEnitity findfirst(Integer id);
}
