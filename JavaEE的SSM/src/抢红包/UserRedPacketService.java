package 抢红包;

public interface UserRedPacketService {
    //保存红包信息，@Param redPacketId 红包编号，@Param userId 抢红包用户编号，返回影响记录数//悲观锁公用
    public int grapRedPacket(Long redPacketId,Long userId);
    //乐观锁
    public int grapRedPacketForVersion(Long redPacketId, Long userId);
    //乐观锁按时间100毫秒
    public int leguanSuoTime(Long redPacketId,Long userId);
    //乐观锁按次数
    public int leguansuocs(Long redPacketId,Long userId);
    //Redis抢红包
    public Long redis(Long redPacketId,Long userId);
}
