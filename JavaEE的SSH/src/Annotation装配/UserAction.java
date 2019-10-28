package Annotation装配;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
public class UserAction {
    @Resource(name = "userService")
    private Userservice userservice;
    public void setUserservice(Userservice userservice)
    {
        this.userservice=userservice;
    }
    public void save()
    {
        this.userservice.save();
        System.out.println("UserAction 使用了！！！");
    }

}
