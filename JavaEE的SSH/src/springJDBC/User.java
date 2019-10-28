package springJDBC;

public class User {
    private Integer userid;
    private String username;
    private String password;
    public void setUserid(Integer userid)
    {
        this.userid=userid;
    }
    public Integer getUserid()
    {
        return userid;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getUsername()
    {
        return username;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return password;
    }
    @Override
    public String toString()
    {
        return "UserDao [userid="+userid+",username="+username+",password="+password+"]";
    }

}
