package com.processor;

import com.util.SslUtils;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class ImageProcessor implements PageProcessor {
/**
 *     爬取的列表页，页数。
 */
    /**
     * 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
     */
    private Site site = Site.me().setRetryTimes(3).setSleepTime(3000);
    /**
     * 爬取图片
     */
    public int j = 1;

    public static InputStream inStream = null;

    public void process(Page page) {
        //获取图片
        while (page.getHtml().xpath("//span[@class=\"RichText ztext CopyrightRichText-richText\"]/figure[" + j + "]/img").css("img", "data-original").toString() != null) {
            String string1 = page.getHtml().xpath("//span[@class=\"RichText ztext CopyrightRichText-richText\"]/figure[" + j + "]/img").css("img", "data-original").toString();
            j++;
            System.out.println(string1);
            try {
                File mk=new File("D:\\Img");
                if(!mk.exists()){
                    //如果文件夹不存在，就创建文件夹
                    mk.mkdir();
                }
                URL url = new URL(string1);
                URLConnection con = url.openConnection();
                if("https".equalsIgnoreCase(url.getProtocol())){
                    SslUtils.ignoreSsl();
                }
                inStream = con.getInputStream();
                ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int len = 0;
                while((len = inStream.read(buf)) != -1){
                    outStream.write(buf,0,len);
                }
                inStream.close();
                outStream.close();
                File file = new File("d://Img//"+j+".jpg");
                FileOutputStream op = new FileOutputStream(file);
                op.write(outStream.toByteArray());
                op.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 设置属性
     */
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        System.out.println("开始爬取图片");
        String url = "https://www.zhihu.com/question/29784516/answer/54897151";
        //启动爬虫
        Spider.create(new ImageProcessor())
                //添加初始化的URL
                .addUrl(url)
                .thread(5)
                //运行
                .addPipeline(new FilePipeline("d:\\Img\\"))
                .run();
        long endTime=System.currentTimeMillis();
        System.out.println("爬取一共耗时: "+(endTime-startTime)+"ms");
    }

}
