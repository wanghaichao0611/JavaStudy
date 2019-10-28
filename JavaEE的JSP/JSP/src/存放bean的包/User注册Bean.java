package 存放bean的包;
public class User注册Bean
{
    private String userName;
    private String password;
    private int age;
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public String getPassword()
    {
        return "********";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
