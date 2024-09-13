package multithreading;

public class SynchronizedMethodDemo {

    synchronized	void firstThree(int num) {

        for(int i=num;i<num+3;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedMethodDemo synchronizedMethodDemo=new SynchronizedMethodDemo();

        Runnable runnable=new Runnable() {

            @Override
            public void run() {
                synchronizedMethodDemo.firstThree(10);

            }
        };

        Runnable runnable1=new Runnable() {

            @Override
            public void run() {
                synchronizedMethodDemo.firstThree(20);

            }
        };

        new Thread(runnable).start();
        new Thread(runnable1).start();


    }

}