package com.单文件上传;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUploadController {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest httpServletRequest)
    {
        String realPath=httpServletRequest.getSession().getServletContext().getRealPath("/uploadFile/");
        String format=simpleDateFormat.format(new Date());
        File file=new File(realPath+format);
        if (!file.isDirectory())
        {
            file.mkdirs();
        }
        String oldName=uploadFile.getOriginalFilename();
        String newName=UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."),oldName.length());
        try
        {
            uploadFile.transferTo(new File(file,newName));
            String filePath=httpServletRequest.getScheme()+"://"+httpServletRequest.getServerName()+":"+httpServletRequest.getServerPort()+"/uploadFile/"+format+"/"+newName;
            return filePath;
        }
        catch (Exception e){e.printStackTrace();}
        return "上传失败!";
    }
}
