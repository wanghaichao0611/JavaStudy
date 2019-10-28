package 外观模式原理;
//音乐实现类
public class MusicImpl implements Music {
    @Override
    public void play() {
        System.out.println("播放古典音乐");
    }
}
