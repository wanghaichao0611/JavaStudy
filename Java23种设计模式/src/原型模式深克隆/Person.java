package 原型模式深克隆;
//原型模式：用原型实例创建对象的种类，并且通过拷贝这些原型创建的新对象
public class Person implements  Cloneable {
    private int age;
    public Person(int age){
        super();
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
