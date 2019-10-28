package 抢红包;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //Spring IOC环境配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //配置Spring ICO资源
        return new Class<?>[] { RootConfig.class };
    }
    //DispatcherServlet环境配置

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }
    //DispatchServlet拦截请求配置

    @Override
    protected String[] getServletMappings() {
        return new String[] { "*.do" };
    }
    //@Param dynamic Servlet上传文件配置

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic dynamic) {
        //配置上传文件路劲
        String filepath="e:/mvc/uploads";
        //5MB
        Long singleMax=(long) (5*Math.pow(2,20));
        //10MB
        Long totalMax=(long)(10*Math.pow(2,20));
        //设置上传文件配置
        dynamic.setMultipartConfig(new MultipartConfigElement(filepath,singleMax,totalMax,0));
    }
}
