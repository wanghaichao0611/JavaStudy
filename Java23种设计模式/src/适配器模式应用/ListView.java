package 适配器模式应用;
//数组展示控件 ListView
public class ListView {
    private Adapter adapter;
    public void setAdapter(Adapter adapter){
        this.adapter=adapter;
    }
    public void show(){
        String[] data=adapter.createUI();
        for (String str:data){
            System.out.println(str);
        }
    }
}
