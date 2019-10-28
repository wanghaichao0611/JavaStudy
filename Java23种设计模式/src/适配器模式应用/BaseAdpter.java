package 适配器模式应用;
//带图片的数组适配器实现类
public class BaseAdpter implements Adapter {
    private String[] data;
    public BaseAdpter(String[] data){
        this.data=data;
    }

    @Override
    public String[] createUI() {
        for (int i=0;i<data.length;i++){
            data[i]="图片 :"+data[i];
        }
        return this.data;
    }
}
