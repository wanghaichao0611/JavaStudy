package creationalPatterns.simpleFactoryPattern.SimpleFactoryExample;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class SimpleFactoryXMLUtil {
    //该方法用于从XML配置文件中提取图表类型，并返回类型名
    public static String getChartType(){
        try{
            //创建文档对象
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src//creationalPatterns//simpleFactoryPattern//SimpleFactoryExample//simpleFactory.xml"));

            //获取包含图表类型的文本节点
            NodeList nodeList=doc.getElementsByTagName("chartType");
            Node classNode=nodeList.item(0).getFirstChild();
            String chartType=classNode.getNodeValue().trim();
            return chartType;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
