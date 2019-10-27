package 第十一章多线程;
    class Tickets
    {
        protected int size;
        int number = 0;
        boolean available = false;

        public Tickets(int size) {
            this.size = size;
        }

        public synchronized void put() {
            if (available==true)
                try {
                    wait();
                } catch (Exception e) {
                }
            System.out.println("存入第【"+(++number)+"】号票");
            available = true;
            notify();
        }

        public synchronized void sell() {
            if (available==false)
                try {
                    wait();
                } catch (Exception e) {
                }
            System.out.println("售出第【"+(number)+"】号票");
            available = false;
            notify();
            if (number == size) number = size + 1;
            //number>size 表示售票结束
        }
    }

    class Producer extends Thread {
        Tickets t = null;

        public Producer(Tickets t) {
            this.t = t;
        }

        public void run() {
            while (t.number < t.size)
                t.put();
        }
    }

    class Consumer extends Thread {
        Tickets t = null;

        public Consumer(Tickets t) {
            this.t = t;
        }

        public void run() {
            while (t.number <= t.size)
                t.sell();
        }
    }
public class 线程之间的通信
{
    public static void main(String[] args)
    {
        Tickets t = new Tickets(10);
        new Producer(t).start();
        new Consumer(t).start();
    }
}