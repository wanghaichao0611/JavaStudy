package 抢红包;

public interface RedisRedPacketService {
    //保存抢红包列表，@param redpackerId 抢红包编号，@Param unitAmount 红包金额
    public void saveUserRedPacketByRedis(Long redPacketId,Double unitAmount);
}
