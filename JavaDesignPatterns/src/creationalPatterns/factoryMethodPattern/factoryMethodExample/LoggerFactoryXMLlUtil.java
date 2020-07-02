package creationalPatterns.factoryMethodPattern.factoryMethodExample;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LoggerFactoryXMLlUtil {
    //该方法用于从XML配置文件中提取具体表的类名，并返回一个实例对象
    public static Object getBean(){
        try{
            //创建DOM文档对象
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src//creationalPatterns//factoryMethodPattern//factoryMethodExample//FileLoggerFactory"));

            //获取包含类名的文本节点
            NodeList nodeList=doc.getElementsByTagName("className");
            Node classNode=nodeList.item(0).getFirstChild();
            String cName=classNode.getNodeValue().trim();

            //通过类名生成实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
