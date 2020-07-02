package creationalPatterns.simpleFactoryPattern.SimpleFactoryExample;


public class SimpleExampleClient {
    public static void main(String[] args){

        Chart chart;
        //通过静态工厂方法创建产品
        //chart=ChartFactory.getChart("histogram");
        //chart=ChartFactory.getChart("pie");
        //读取配置文件中的参数，符合开闭原则。
        String type=SimpleFactoryXMLUtil.getChartType();
        chart=ChartFactory.getChart(type);
        chart.display();
    }
}
