package 售票排队案例;

import java.util.LinkedList;

    class Station implements Runnable {
        public static boolean isRun = true;
        private static int ticketNumber = 5;//5张火车票
        private static LinkedList<String>
                personList = new LinkedList<String>();//火车站排队 买票的人

        public Station() {
            personList.add("赵海");
            personList.add("王锐");
            personList.add("宋沙");
            personList.add("李伟");
            personList.add("徐晓");
        }

        //打开售票窗口 售票窗口就是线程
        public Thread openWindow(String name) {
            return new Thread(this, name);
        }

        @Override
        public void run() {
            try {
                //不停地售票
                while (isRun) {
                    if (ticketNumber < 1) {
                        System.out.println("火车票已经卖完!");
                    } else {
                        if (!personList.isEmpty()) {
                            String person = personList.poll();//从队列中取出排在头一个的人
                            System.out.println(person + "" + Thread.currentThread().getName() + " 买了一张长沙的火车票");
                            ticketNumber--;
                        } else {
                            System.out.println("排队的人已经买完票");
                        }
                    }
                    Thread.sleep(1000);//休眠1秒
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
public class TestStation {
    public static void dmain(String[] args){
        //火车站开门
        Station station=new Station();
        //打开两个窗口同时售票，也就是两个线程
        for (int i=1;i<=2;i++){
            Thread win=station.openWindow("窗口"+i);
            win.start();
        }
    }
}