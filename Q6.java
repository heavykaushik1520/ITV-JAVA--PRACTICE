public class Q6 {

    public  static  void  main(String args[])
    {
        // Write a program to find and print the first 5 prime numbers.

        int n = 2;

        int count = 0;
        while (count < 5)
        {
            boolean flag = false;

            for (int i = 2; i < n ; i++)
            {
                if (n % i == 0)
                {
                    flag = true;
                    break;
                }
            }



            if (!flag)
            {
                System.out.println(n);
                count++;

            }
            n++;

        }
    }

}
