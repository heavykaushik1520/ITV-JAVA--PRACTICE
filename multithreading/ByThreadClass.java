package multithreading;

class MyThread3 extends Thread{
    @Override
    public void run ()
    {
        for (int i = 11; i < 16 ; i++) {

            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}

class MyThread4 extends Thread{
    @Override
    public void run ()
    {
        for (int i = 1; i < 6 ; i++) {

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}

public class ByThreadClass {

    public static void main(String[] args) {

        MyThread3 mt3 = new MyThread3();
        mt3.start();

        MyThread4 mt4 = new MyThread4();
        mt4.start();
    }
}
