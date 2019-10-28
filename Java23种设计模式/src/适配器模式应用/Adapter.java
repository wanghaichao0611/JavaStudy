package 适配器模式应用;
//实用应用场景：Android 控件数据填充,相同的数据 不同的适配器展示效果不一样
//适配器接口
public interface Adapter {
    public String[] createUI();//创建UI展示数据
}
