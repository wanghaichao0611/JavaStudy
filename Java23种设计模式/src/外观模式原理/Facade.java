package 外观模式原理;
//门面模式 界面 提供一个一致统一的接口 调用
public class Facade {
    private Light light;
    private Music music;
    private Video video;
    public Facade(){
        light=new LightImpl();
        music=new MusicImpl();
        video=new VideoImpl();
    }
    public void sing(){
        System.out.println("开始演唱 伴随");
        light.flash();
        music.play();
    }
    public void dance(){
        System.out.println("开始跳舞 伴随");
        light.flash();
        music.play();
        video.show();
    }
    public void ace(){
        System.out.println("开始小品 伴随");
        light.flash();
        video.show();
    }
}
