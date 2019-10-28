package java设计模式;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectServiceImpl {
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }

    public reflectServiceImpl getInstance()//反射生成对象
    {
        reflectServiceImpl object = null;
        try {
            object = (reflectServiceImpl) Class.forName("java设计模式.reflectServiceUmpl").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
    public Object reflectMethod()//获取和反射方法
    {
        Object returnObj = null;
        reflectServiceImpl target = new reflectServiceImpl();
        try {
            Method method = reflectServiceImpl.class.getMethod("sayHello", String.class);
            returnObj = method.invoke(target, "张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObj;
    }
}
