package 策略模式原理;
//测试
public class TestStrategy {
    public static void main(String[] args){
        Context ctx=new Context(new StrategyImplA());
        ctx.doMethod();

        ctx=new Context(new StrategyImplB());
        ctx.doMethod();

        ctx=new Context(new StrategyImplC());
        ctx.doMethod();
    }
}
