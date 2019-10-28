package 桥接模式原理;
//桥接模式：将抽象部分与它的实现部分分离，是他们都可以独立地变化，不同的人穿不同的衣服
public abstract class Clothing {
    protected String name;
    protected Person person;
    public Clothing(String name){
        super();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
