package 策略模式原理;

import 策略模式原理.Strategy;
//策略环境封装
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public void doMethod(){
        strategy.method();
    }
}
