package 建造模式应用;
//测试
public class TestDialog {
    public static void main(String[] args){
        //建造对话框部件
        AlertDialog.Builder builder=new AlertDialog.Builder();
        builder.setTitle("提示");
        builder.setMessage("确认要退出吗？");
        builder.setPositiveButton(new Button("确定按钮"));
        builder.setNagetiveButton(new Button("取消按钮"));

        //创建并弹出对话框
        AlertDialog  dialog=builder.create();
        dialog.show();
    }

}
