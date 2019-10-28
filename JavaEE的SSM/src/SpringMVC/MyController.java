package SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("myController")//注意表示它是一个控制器
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/index")
    public ModelAndView index()
    {
        //模型和视图
        ModelAndView mv=new ModelAndView();
        //视图逻辑名称为index
        mv.setViewName("/grap.jsp");
        //返回模型和视图
        return  mv;
    }
}
