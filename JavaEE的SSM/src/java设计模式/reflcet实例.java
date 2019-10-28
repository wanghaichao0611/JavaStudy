package java设计模式;

import java.lang.reflect.Method;

public class reflcet实例 {
    private String name;
    public void hh(String name)
    {
        this.name=name;
    }
    public void say()
    {
        System.out.println("hello"+name);
    }
    public void reflect() {
        reflcet实例 object = null;
        try {
            object = (reflcet实例)Class.forName("java设计模式.reflcet实例").newInstance();
            Method method=object.getClass().getMethod("say",String.class);
            method.invoke(object,"张三");
        }catch (Exception e){e.printStackTrace();}
    }
}