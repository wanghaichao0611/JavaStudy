package cn.itcast.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import cn.itcast.demain.User;
 public class LoginAction1 extends ActionSupport implements ModelDriven<User>{
    private static final long serialVersionUID=1L;
    private User user=new User();
    public User getModel()
    {
        return user;
    }
    public String execute() throws Exception
    {
        ActionContext actioncontext=ActionContext.getContext();
        if ("tom".equals(user.getUsername())&&"123".equals(user.getPassword()))
        {
            actioncontext.getSession().put("user",user);
            return SUCCESS;
        }
        else{
            actioncontext.put("msg","用户名或密码不正确!");
            return INPUT;
        }
    }
}