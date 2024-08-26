public class Q9 {
    public  static  void  main(String args[])
    {
        // 9. Write a program to find and print the largest digit in the number 4825.
        int n = 4825 , rem , max = 0;
        while (n > 0)
        {
            rem = n % 10;

            if (rem > max)
            {
                max = rem;

            }

            n = n / 10;
        }

        System.out.println("Largest number in 4825 is " + max);
    }
}
