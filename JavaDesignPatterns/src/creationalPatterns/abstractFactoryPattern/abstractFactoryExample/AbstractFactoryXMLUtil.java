package creationalPatterns.abstractFactoryPattern.abstractFactoryExample;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class AbstractFactoryXMLUtil {
    //创建文档对象
    public static Object getBean(){
        try{
            //创建DOM文档对象
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src//creationalPatterns//abstractFactoryPattern//abstractFactoryExample//AbstractFactory.xml"));

            //获取包含类名的文本节点
            NodeList nodeList=doc.getElementsByTagName("abstractClassName");
            Node abstractClassNode=nodeList.item(0).getFirstChild();
            String abstractClassName=abstractClassNode.getNodeValue().trim();

            //通过类名生成实例对象并将其返回
            Class c=Class.forName(abstractClassName);
            Object object=c.newInstance();
            return object;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
