package creationalPatterns.factoryMethodPattern.factoryMethodExample;



//LoggerFactoryClient：客户端测试类
public class LoggerFactoryClient {
    public static void main(String[] args){
        LoggerFactory loggerFactory;
        Logger logger;
        //可以引入配置文件或反射机制完成
        loggerFactory= (LoggerFactory) LoggerFactoryXMLlUtil.getBean();
       // loggerFactory=new FileLoggerFactory();
        logger=loggerFactory.createLogger();
        logger.writeLog();
    }
}
