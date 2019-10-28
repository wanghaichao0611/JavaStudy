package Excel视图;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class ExcelView extends AbstractXlsView {
    //文件名
    private String fileName=null;
    //导出视图自定义接口
    private ExcelExportService excelExportService=null;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ExcelExportService getExcelExportService() {
        return excelExportService;
    }

    public void setExcelExportService(ExcelExportService excelExportService) {
        this.excelExportService = excelExportService;
    }

    //构造方法1
    public ExcelView(ExcelExportService excelExportService)
    {
        this.excelExportService=excelExportService;
    }
    //构造方法2
    public ExcelView(String viewName,ExcelExportService excelExportService)
    {
        this.setBeanName(viewName);
    }

    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //没有自定义接口
        if (excelExportService==null)
        {
            throw  new RuntimeException("导出服务接口不能null！");
        }
        //文件名不为空,为空则使用请求路径中的字符串为文件名
        if (!StringUtils.isEmpty(fileName))
        {
            //进行字符转换
            String reqCharset=httpServletRequest.getCharacterEncoding();
            reqCharset=reqCharset==null ? "UTF-8":reqCharset;
            fileName=new String(fileName.getBytes(reqCharset),"ISO8859-1");
            //设置下面文件名
            httpServletResponse.setHeader("Content-disposition","attachment;filename="+fileName);
        }
        //回调接口方法,使用自定义生成Excel文档
        excelExportService.makeWorkBook(model,workbook);
    }
}
