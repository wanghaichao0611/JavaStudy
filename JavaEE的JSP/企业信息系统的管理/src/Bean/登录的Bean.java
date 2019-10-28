package Bean;
public class 登录的Bean {
    private String userName;
    private String password;

    public 登录的Bean() { }
    public String getUserName(){
        try {
            byte b[] = userName.getBytes("ISO-8859-1");
            userName=new String(b,"UTF-8");
            return userName;
        }catch (java.io.UnsupportedEncodingException e){e.printStackTrace();}
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public  String getPassword() {
        try {
            byte b[]=password.getBytes("ISO-8859-1");
            password=new String(b,"UTF-8");
            return password;
        }catch (java.io.UnsupportedEncodingException e){e.printStackTrace();}
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }

}
