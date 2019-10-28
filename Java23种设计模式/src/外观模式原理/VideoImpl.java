package 外观模式原理;

//视频接口类
public class VideoImpl implements Video {
    @Override
    public void show() {
        System.out.println("显示高山流水视频");
    }
}
