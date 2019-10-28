package 抢红包;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RedPacketMapper {
    //获取红包信息，@Parma id红包id，返回红包具体信息
    public RedPacket getRedPacket(Long id);
    //减扣红包数，@Param id--红包id，返回更新记录条数
    public int decreaseRedPacket(Long id);
    //悲观锁
    public RedPacket getRedPacketForUpdate(Long id);
    //乐观锁
    public  int decreaseRedPacketForVersion( @Param("id") Long id,@Param("version") Integer version);
}