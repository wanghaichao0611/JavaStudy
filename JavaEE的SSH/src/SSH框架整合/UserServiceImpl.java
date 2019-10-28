package SSH框架整合;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao)
    {
        this.userDao=userDao;
    }

    @Override
    public void saveUser(WhcUserEnitity whcUserEnitity) {
        this.userDao.save(whcUserEnitity);
    }

    @Override
    public void updateUser(WhcUserEnitity whcUserEnitity) {
        this.userDao.update(whcUserEnitity);
    }

    @Override
    public void deleteUser(WhcUserEnitity whcUserEnitity) {
        this.userDao.delete(whcUserEnitity);
    }

    @Override
    public WhcUserEnitity findfirst(Integer id) {
        return this.userDao.findOneid(id);
    }
}
