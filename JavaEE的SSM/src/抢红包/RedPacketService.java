package 抢红包;

public interface RedPacketService {
    //获取红包@Param id编号，返回红包信息
    public RedPacket getRedPacket(Long id);
    //扣减红包@Param id编号，返回影响条数
    public int decreaseRedPacket(Long id);
}
