package 适配器模式应用;
//测试
public class TestAdpter {
    public static void main(String[] args){
        String[] data={"北京","天津","上海","重庆",};

        ListView listView=new ListView();

        listView.setAdapter(new ArrayAdpter(data));
        listView.show();

        listView.setAdapter(new BaseAdpter(data));
        listView.show();
    }
}
