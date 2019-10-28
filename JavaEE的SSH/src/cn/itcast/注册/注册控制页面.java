package cn.itcast.注册;
import java.util.List;

import cn.itcast.注册.登录和注册的JavaBean;

import cn.itcast.注册.Information;

import com.opensymphony.xwork2.ActionSupport;

public class 注册控制页面 extends ActionSupport {
    private String userName;
    private String passWord;
    private String Enture;
    private String Mail;
    private String Phone;
    private String mess=ERROR;  //ERROR等同于"error"
    private List list;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String password1) {
        this.passWord = password1;
    }
    public String getEnture(){
        return Enture;
    }
    public void setEnture(String password2) {
        this.Enture = password2;
    }
    public void setMail(String mail)
    {
        this.Mail=mail;
    }
    public String getMail()
    {
        return Mail;
    }
    public void setPhone(String phone)
    {
        this.Phone=phone;
    }

    public void validate(){
        if(this.getUserName()==null||this.getUserName().length()==0){
            addFieldError("userName", "用户名不能为空！");
        }else{
            登录和注册的JavaBean info= new 登录和注册的JavaBean();
            list=info.queryInfo("userName", this.getUserName());
            Information ui=new Information();
            for(int i=0;i<list.size();i++){
                ui=(Information) list.get(i);
                if(ui.get用户名().equals(this.getUserName())){
                    addFieldError("userName", "用户名已存在！");
                }
            }
        }
        if(this.getPassWord()==null||this.getPassWord().length()==0){
            addFieldError("password1", "登录密码不许为空！");
        }else if(this.getEnture()==null||this.getEnture().length()==0){
            addFieldError("password2", "重复密码不许为空！");
        }else if(!this.getPassWord().equals(this.getEnture())){
            addFieldError("password2", "两次密码不一致！");
        }
    }

    public Information userInfo(){
        Information info=new Information();
        info.set用户名(this.getUserName());
        info.set密码(this.getPassWord());
        return info;
    }

    public String execute() throws Exception{
        登录和注册的JavaBean lr=new 登录和注册的JavaBean();
        String ri=lr.save(userInfo());
        if(ri.equals("success")){
            mess=SUCCESS;
        }

        return mess;
    }

}