package 建造模式应用;
//对话框创建类
public class AlertDialog {
    private String title;//标题
    private String message;//消息
    private Button positiveButton;//确定按钮
    private Button  nagetiveButton;//取消按钮
    public AlertDialog(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Button getPositiveButton() {
        return positiveButton;
    }

    public void setPositiveButton(Button positiveButton) {
        this.positiveButton = positiveButton;
    }

    public Button getNagetiveButton() {
        return nagetiveButton;
    }

    public void setNagetiveButton(Button nagetiveButton) {
        this.nagetiveButton = nagetiveButton;
    }
    public void show(){
        System.out.println(this.title);
        System.out.println(this.message);
        System.out.println(this.positiveButton.getName());
        System.out.println(this.nagetiveButton.getName());
        System.out.println("弹出显示对话框");
    }
    static class Builder{
        private AlertDialog dialog;
        public Builder(){
            dialog=new AlertDialog();
        }
        public void setTitle(String title){
            dialog.setTitle(title);
        }
        public void setMessage(String message){
            dialog.setMessage(message);
        }
        public void setPositiveButton(Button positiveButton){
            dialog.setPositiveButton(positiveButton);
        }
        public void setNagetiveButton(Button nagetiveButton){
            dialog.setNagetiveButton(nagetiveButton);
        }
        public AlertDialog create(){
            return dialog;
        }
    }
}
