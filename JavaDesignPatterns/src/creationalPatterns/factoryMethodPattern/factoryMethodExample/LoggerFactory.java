package creationalPatterns.factoryMethodPattern.factoryMethodExample;

/**
 * 例题：某系统运行日志记录器（Logger）可以通过多种途径保存系统的运行日志，例如通过文件记录或数据库记录，用户可以通过修改
 * 配置文件灵活地更换日志记录方法。在设计个类日志记录器时，开发人员发现需要对日志记录器进行一些初始化工作，初始化参数地设置
 * 过程较为复杂，而且某些参数的设置有严格的先后次序，否则可能会发生记录失败。为了更好地封装记录器的初始化过程并保证多种记录器
 * 奇幻的灵活性，现使用工厂方法方法模式设计该系统（注：在Java中常用的日志记录工具有SF4J、Log4j、GCLogViewer、Logstash等）
 * LoggerFactory：日志记录工厂接口，充当抽象工厂角色
 */
public interface LoggerFactory {

    //抽象工厂方法
    public Logger createLogger();

}
