package Spring事务管理;

public interface AccountDao {
    public void out(String outUser,int money);
    public void in(String inUser,int money);
}
