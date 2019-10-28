package java设计模式;

public class reflectServiceImpl2 {
    private String name;
    public reflectServiceImpl2(String name)
    {
        this.name=name;
    }
    public void sayhello()
    {
        System.out.println("hello"+name);
    }
    public reflectServiceImpl2 getInstance() {
        reflectServiceImpl2 object = null;
        try {
            object = (reflectServiceImpl2) Class.forName("java设计模式.reflectServiceImpl2").getConstructor(String.class).newInstance("张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
