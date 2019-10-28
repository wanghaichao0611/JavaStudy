package Spring事务管理;

import org.springframework.jdbc.core.JdbcTemplate;
import Spring事务管理.AccountDao;
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
    public void out(String outUser,int money)
    {
        this.jdbcTemplate.update("update whc set money=money-?"+" where sName=?",money,outUser);
    }
    public void in(String inUser,int money)
    {
        this.jdbcTemplate.update("update whc set money=money+?"+" where sName=?",money,inUser);
    }
}
