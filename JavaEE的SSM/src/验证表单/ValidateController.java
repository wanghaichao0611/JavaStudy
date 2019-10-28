package 验证表单;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/validate")
public class ValidateController {
    @RequestMapping("/annotation")
    public ModelAndView annotationValidate(@Valid Transaction trans, Errors errors)
    {
        //是否存在错误
        if (errors.hasErrors())
        {
            //获取错误信息
            List<FieldError> errorList=errors.getFieldErrors();
            for(FieldError error:errorList)
            {
                //打印字段错误信息
                System.out.println("fied:"+error.getField()+"\t"+"msg:"+error.getDefaultMessage());
            }
        }
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/grap.jsp");
        return mv;
    }

}
