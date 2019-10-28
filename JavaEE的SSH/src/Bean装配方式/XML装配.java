package Bean装配方式;

public class XML装配 {
    private String username;
    private Integer password;
    public String getUsername()
    {
        return username;
    }
    public  void setUsername(String username)
    {
        this.username=username;
    }
    public Integer getPassword()
    {
        return  password;
    }
    public  void setPassword(Integer password)
    {
        this.password=password;
    }
    //默认构造器;//
    public XML装配()
    {
        super();
    }
    //构造方法注入//
    public XML装配(String username,Integer password)
    {
        super();
        this.username=username;
        this.password=password;
    }
    public String toString()
    {
        return "XML装配[username="+username+",password="+password+"]";
    }
}
