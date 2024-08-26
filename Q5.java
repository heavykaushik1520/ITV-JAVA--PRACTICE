public class Q5 {

    public  static  void  main(String args[])
    {
        // 5. Write a program to print the Fibonacci sequence up to the number 21.
        System.out.print("Fibonacci sequence up to the number 21 : ");
        int t1 = 0 , t2 = 1 , t3;
        System.out.print(t1 + " " + t2 );
        boolean x = true;
        int i = 2;
        while (x)
        {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;

            System.out.print(" " + t3);
            if (t3 == 21)
            {
                return;
            }
        }
    }

}
