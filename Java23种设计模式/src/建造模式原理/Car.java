package 建造模式原理;
//建造模式:将一个复杂的对象的构建与它的表示分离，使得同样的过程可以创建不同的表示
//汽车类 分为三个部分 头 身 脚
public class Car {
    private String head;//头
    private String body;//身
    private String foot;//脚

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
