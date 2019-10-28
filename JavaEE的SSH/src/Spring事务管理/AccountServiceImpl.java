package Spring事务管理;
import Spring事务管理.AccountDao;
import Spring事务管理.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao)
    {
        this.accountDao=accountDao;
    }
    @Override
    public  void transfer(String outUser,String inUser,int money)
    {
        this.accountDao.out(outUser,money);
        this.accountDao.in(inUser,money);
    }
}
