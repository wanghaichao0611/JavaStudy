package 建造模式应用;
//Androidd的对话框Dialog的创建，内部分别创建提示，消息和按钮，最后建造完成对话框弹出
public class Button {
    private String name;
    public Button(String name){
        super();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
