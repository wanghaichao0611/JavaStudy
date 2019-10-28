package 控制器接受各种请求参数;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

//无法注解获取HTTP请求参数
@Controller
@RequestMapping("/params")
public class ParamsController {
    @RequestMapping("/commonParams")
    public ModelAndView commonParams(String roleName, String note) {
        System.out.println("roleName=>" + roleName);
        System.out.println("note+>" + note);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/grap.jsp");
        return mv;
    }
    //POJO和HTTP请求参数名称保持一致
    @RequestMapping("/commonParamPojo")
    public ModelAndView commonParamPojo(Pojo pojo)
    {
        System.out.println("roleName=>"+pojo.getRoleName());
        System.out.println("note=>"+pojo.getNote());
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/grap.jsp");
        return mv;
    }
    @RequestMapping("/requestParam")
    //使用@RequestParam指定HTTP参数名称,使用这个注解参数默认不能为空,若允许为空require=false；
    public ModelAndView requestParam(@RequestParam(value ="role_name",required = false) String roleName,String note)
    {
        System.out.println("roleName=>"+roleName);
        System.out.println("note=>"+note);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/grap.jsp");
        return mv;
    }
    //使用URL传递参数
    @Autowired
    RoleMapper roleMapper=null;
    //{id}代表一个参数
    @RequestMapping("/getRole/{id}")
    //使用注解@PathVariable表示从URL的请求地址中获取参数
    public ModelAndView pathVariable(@PathVariable("id") Long id)
    {
        Role role=roleMapper.findById(id);
        ModelAndView mv=new ModelAndView();
        //绑定数据模型
        mv.addObject(role);
        //设置为JSON视图
        mv.setView(new MappingJackson2JsonView());
        return mv;
    }
}
