package creationalPatterns.simpleFactoryPattern.SimpleFactoryExample;


/**
 *例题：某软件公司要基于Java语言开发一套图库表，该图库表可以为应用系统提供多种不同外观的图表，例如柱状图（HistogramChart）、
 * 饼状图（PieChart）、折线图（LineChart）等。该软件公司图表设计人员希望为应用系统开发人员提供一套灵活易用的图标库，通过设置
 * 不同的参数即可得到不同类型的图表，而且可以较为方便地对图标库进行扩展，以便能够在将来增加一些新类型的图表，采用简单工厂模式。
 */
public class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String type){
        Chart chart=null;
        if (type.equalsIgnoreCase("histogram")){
            chart=new HistogramChart();
            System.out.println("初始化设置柱状图");
        }else if (type.equalsIgnoreCase("pie")){
            chart=new PieChart();
            System.out.println("初始化设置饼状图");
        }else if (type.equalsIgnoreCase("line")){
            chart=new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
