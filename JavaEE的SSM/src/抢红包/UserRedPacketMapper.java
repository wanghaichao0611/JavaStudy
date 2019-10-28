package 抢红包;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRedPacketMapper {
    public int grapRedPacket(UserRedPacket userRedPacket);
}