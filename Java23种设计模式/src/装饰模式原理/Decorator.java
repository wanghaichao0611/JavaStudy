package 装饰模式原理;
//不同场合扮演不同的角色
public abstract class Decorator implements Person {
    protected Person p;
    public Decorator(Person p){
        this.p=p;
    }
}
