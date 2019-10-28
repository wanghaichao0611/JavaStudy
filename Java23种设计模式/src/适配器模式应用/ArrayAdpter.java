package 适配器模式应用;
//数组适配器实现类
public class ArrayAdpter implements Adapter {
    private String[] data;
    public ArrayAdpter(String[] data){
        this.data=data;
    }

    @Override
    public String[] createUI() {
        return this.data;
    }
}
