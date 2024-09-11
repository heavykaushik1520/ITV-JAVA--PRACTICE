package multithreading;
class MyThread1 implements  Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 6 ; i++) {

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

        }
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 11; i < 16 ; i++) {

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


public class DemoThread {

    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        Thread t1 = new Thread(mt1);
        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread(mt2);

        t1.start();
        t2.start();
    }


}
