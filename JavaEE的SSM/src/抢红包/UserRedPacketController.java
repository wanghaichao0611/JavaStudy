package 抢红包;

import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserRedPacketController {
    @Autowired
    private UserRedPacketService userRedPacketService=null;
    @RequestMapping("/grap")
    @ResponseBody
    public Map<String,Object> grapRedPacket(Long redPacketId, Long userId)
    {
        //抢红包
        int result=userRedPacketService.grapRedPacket(redPacketId,userId);
        Map<String,Object>retMap=new HashMap<String,Object>();
        boolean flag=result >0;
        retMap.put("success",flag);
        retMap.put("message",flag? "抢红包成功":"抢红包失败");
        return retMap;
    }
    @RequestMapping(value = "/grapRedPacketForVersion")
    @ResponseBody
    public Map<String,Object> grapRedPacketForVersion( Long redPacketId, Long userId)
    {
        //抢红包
        int result=userRedPacketService.grapRedPacketForVersion(redPacketId,userId);
        Map<String,Object> retMap=new HashMap<String,Object>();
        boolean flag=result >0;
        retMap.put("success",flag);
        retMap.put("message",flag? "抢红包成功":"抢红包失败");
        return retMap;
    }
    @RequestMapping(value = "/leguansuotime")
    @ResponseBody
    public Map<String,Object> leguansuotime( Long redPacketId, Long userId)
    {
        //抢红包
        int result=userRedPacketService.leguanSuoTime(redPacketId,userId);
        Map<String,Object> retMap=new HashMap<String,Object>();
        boolean flag=result >0;
        retMap.put("success",flag);
        retMap.put("message",flag? "抢红包成功":"抢红包失败");
        return retMap;
    }
    @RequestMapping(value = "/leguansuocs")
    @ResponseBody
    public Map<String,Object> leguansuocs( Long redPacketId, Long userId)
    {
        //抢红包
        int result=userRedPacketService.leguansuocs(redPacketId,userId);
        Map<String,Object> retMap=new HashMap<String,Object>();
        boolean flag=result >0;
        retMap.put("success",flag);
        retMap.put("message",flag? "抢红包成功":"抢红包失败");
        return retMap;
    }
    @RequestMapping(value = "/redis")
    @ResponseBody
    public Map<String,Object> redis( Long redPacketId, Long userId)
    {
        Map<String,Object> retMap=new HashMap<String,Object>();
        Long result=userRedPacketService.redis(redPacketId,userId);
        boolean flag=result >0;
        retMap.put("success",flag);
        retMap.put("message",flag? "抢红包成功":"抢红包失败");
        return retMap;
    }
}
