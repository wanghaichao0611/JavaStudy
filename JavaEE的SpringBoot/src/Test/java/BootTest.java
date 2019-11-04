import com.ActiveMQ.JmsComponent;
import com.ActiveMQ.Message;
import com.App;
import com.Mail.MailService;
import com.Mail.User;
import com.service.MethodService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.StringWriter;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class BootTest {
    @Autowired
    JmsComponent jmsComponent;

    @Test
    public void test() {
        Message message = new Message();
        message.setContent("hello jms!");
        message.setDate(new Date());
        jmsComponent.send(message);
    }

    @Autowired
    MailService mailService;

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("949234299@qq.com", "1278097160@qq.com", "592401543@qq.com", "测试邮件主题", "测试邮件内容");

    }

    @Test
    public void sendAttachFileMail() {
        mailService.sendAttachFileMail("949234299@qq.com", "1278097160@qq.com", "测试邮件主题(附件)", "测试邮件内容", new File("E:\\whc\\whc.docx"));
    }

    @Test
    public void sendMailWithImg() {
        mailService.sendMailWithImg("949234299@qq.com", "1278097160@qq.com", "测试邮件主题(图片)", "<div>hello,这是一封带邮件图片资源的邮件:" + "这是图片1:<div><img src='cid:p01'/></div>" + "这是图片2:<div><img src='cid:p02'></div>"
                + "</div>", new String[]{"E:\\picture\\p1.jpg", "E:\\picture\\p2.jpg"}, new String[]{"p01", "p02"});
    }

    @Test
    public void sendHtmlFreeMarkerMail() {
        try {
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_0);
            ClassLoader loader = App.class.getClassLoader();
            configuration.setClassLoaderForTemplateLoading(loader, "ftl");
            Template template = configuration.getTemplate("mailtemplate.ftl");
            StringWriter mail = new StringWriter();
            User user = new User();
            user.setGender("男");
            user.setUsername("汪海潮");
            template.process(user, mail);
            mailService.sendHtmlMail("949234299@qq.com", "1278097160@qq.com", "测试邮件主题(FreeMarker模板)", mail.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Autowired
    TemplateEngine templateEngine;
    @Test
    public void sendHtmlThymeleafMail(){
        Context context=new Context();
        context.setVariable("username","wang");
        context.setVariable("gender","男");
        String mail=templateEngine.process("mailtemplate.html",context);
        mailService.sendHtmlMail("949234299@qq.com", "1278097160@qq.com", "测试邮件主题(Thymeleaf模板)",mail);
    }
}