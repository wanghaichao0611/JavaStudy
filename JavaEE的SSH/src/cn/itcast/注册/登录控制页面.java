package cn.itcast.注册;
import java.util.List;
import cn.itcast.注册.Information;
import com.opensymphony.xwork2.ActionSupport;
import cn.itcast.注册.登录和注册的JavaBean;
public class 登录控制页面 extends ActionSupport {
    private String 用户名;
    private String 密码;
    private String message = "error";
    private List list;

    public String get用户名() {
        return 用户名;
    }

    public void set用户名(String 用户名) {
        this.用户名 = 用户名;
    }

    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码;
    }
    public void 验证登录() {
        if (this.用户名 == null || this.get密码().length() == 0) {
            addFieldError("用户名", "用户名不能为空");
        } else {
            登录和注册的JavaBean 用户名 = new 登录和注册的JavaBean();
            list = 用户名.queryInfo("用户名", this.get用户名());
            Information information = new Information();
            if (list.size() == 0) {
                addFieldError("用户名", "该用户尚未注册");
            } else {
                Information ui = new Information();
                for (int i = 0; i < list.size(); i++) {
                    ui = (Information) list.get(i);
                    if (this.get用户名().equals(ui.get用户名())) {
                        if (ui.get密码().equals(this.get密码())) {
                            message = SUCCESS;
                        } else {
                            addFieldError("password", "登录密码不正确");
                        }
                    }
                }
            }
        }
    }
        public String execute() throws Exception {
        return message;
    } }