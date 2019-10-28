package Excel视图;

import 控制器接受各种请求参数.Role;
import 控制器接受各种请求参数.RoleMapper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import 控制器接受各种请求参数.Pojo;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/my")
public class 导出Excel {
    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public ModelAndView export() {
        //模型和视图
        ModelAndView mv = new ModelAndView();
        //Excel视图，并且设置自定义导出接口
        ExcelView ev = new ExcelView(exportService());
        //文件名
        ev.setFileName("所有角色.xlsx");
        //设置SQL后台参数
        Pojo roleParams = new Pojo();
        //限制1万条
        Pojo page = new Pojo();
        page.setStart(0);
        page.setLimit(10000);
        roleParams.setPojo(page);
        RoleMapper roleMapper = null;
        //查询
        List<Role> roleList = roleMapper.selectAllByIdBetween(0L, 8L);
        //加入数据模型
        mv.addObject("roleList", roleList);
        mv.setView(ev);
        return mv;
    }

    @SuppressWarnings("unchecked")
    private ExcelExportService exportService() {
        //使用Lambda表达式自定义曹处excel规则
        return (Map<String, Object> model, Workbook workbook) -> {
            List<Role> roleList = (List<Role>) model.get("roleList");
            //生成Sheet
            Sheet sheet = workbook.createSheet("所有角色");
            //加载标题
            Row title = sheet.createRow(0);
            title.createCell(0).setCellValue("编号");
            title.createCell(1).setCellValue("名称");
            title.createCell(2).setCellValue("备注");
            //便利角色列表,生成一行行的数据
            for (int i = 0; i < roleList.size(); i++) {
                Role role = roleList.get(i);
                int rowIdx = i + 1;
                Row row = sheet.createRow(rowIdx);
                row.createCell(0).setCellValue(role.getId());
                row.createCell(1).setCellValue(role.getRoleName());
                row.createCell(2).setCellValue(role.getNote());
            }
        };
    }
}