package Excel视图;

import org.apache.poi.ss.usermodel.Workbook;

import java.util.Map;

public interface ExcelExportService {
    //生成exel文件规则，@Param model数据模型 @param workbook excel workbook
    public void makeWorkBook(Map<String,Object>model, Workbook workbook);
}
