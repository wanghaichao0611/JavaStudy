package CountDownLatch闭锁多线程读写文件;

import java.io.*;
import java.util.concurrent.CountDownLatch;

/**CountDownLatch其实就是一个倒计时锁器。每当一个线程完成了自己的任务后，计时器的值就会减1.当计时器的值到达0时
 * 表示所有线程完成了任务，然后在计时器锁上等待的线程就可以恢复继续执行。
 * 例子：当读取大文件比如1G，1T需要花费很长时间，这个时候可以用多线程并发读来提供读取速度，开启多个线程后
 * CountDownLatch.await等待,每个线程读完一段文件CountDownLatch()倒计时减1，直至所有的线程读取完毕完成.
 * **/

public class TestCountDownLatch {
    private static CountDownLatch countDownLatch;
    public static void main(String[] args) {
        try {
            String filePath = "e:\\whc1.txt";
            String destPath = "e:\\whc2.txt";
            InputStream is = new FileInputStream(new File(filePath));
            long contentLength = is.available();//文件总大小
            int threadNum = 5;//同时读取的线程数
            countDownLatch = new CountDownLatch(threadNum);
            long searchLength = contentLength / threadNum;//计算每段要多长
            if (contentLength % threadNum != 0) {
                searchLength++;
            }
            //开启5个线程同时下载
            for (int i = 0; i < threadNum; i++) {
                new Thread(new DownloadThread(filePath, destPath, searchLength, i)).start();
            }
            //等线程都执行完
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("文件读取完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static class DownloadThread implements Runnable{
        private String filePath;
        private String destPath;
        private long serachLength;
        private int i;
        public DownloadThread(String filePath,String destPath,long serachLength,int i){
            this.filePath=filePath;
            this.destPath=destPath;
            this.serachLength=serachLength;
            this.i=i;
        }

        @Override
        public void run() {
            RandomAccessFile raf=null;
            try{
                InputStream is=new FileInputStream(new File(filePath));
                long skip=serachLength*i;
                is.skip(skip);
                raf=new RandomAccessFile(new File(destPath),"rw");
                raf.seek(skip);
                int l=0;
                while ((raf.getFilePointer()<=skip+serachLength)&&((l=is.read())!=-1)){
                    raf.write(1);
                    //测试每隔 1 秒读完一个字节
                /*try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }*/
                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try{
                    raf.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                countDownLatch.countDown();//线程执行完 倒计时锁 减轻1
            }
        }
    }
}
