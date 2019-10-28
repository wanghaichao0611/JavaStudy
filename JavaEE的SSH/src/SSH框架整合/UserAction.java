package SSH框架整合;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<WhcUserEnitity> {
    private WhcUserEnitity whcUserEnitity=new WhcUserEnitity();
    public WhcUserEnitity getModel()
    {
        return this.whcUserEnitity;
    }
    private UserService userService;
    public void setUserService(UserService userService)
    {
        this.userService=userService;
    }
    public String add()
    {
        this.userService.saveUser(whcUserEnitity);
        return "add";
    }


}
