package multithreading;

public class StringBuilderMultiThreading {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hi");

        // Thread 1
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                synchronized(sb) {  // Ensuring thread safety
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("Thread 1: " + sb);
                        sb.append("z");
                        try {
                            Thread.sleep(500);  // Adding a slight delay
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        // Thread 2
        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                synchronized(sb) {  // Ensuring thread safety
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("Thread 2: " + sb);
                        sb.append("y");
                        try {
                            Thread.sleep(100);  // Adding a slight delay
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        // Creating and starting two threads
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

        // Ensuring both threads finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final StringBuilder content: " + sb.toString());
    }
}
