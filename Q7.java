public class Q7 {
    // Write a program to calculate the sum of the digits of the number 9876. The output should be
    //30 (9 + 8 + 7 + 6).

    public  static  void  main(String args[])
    {
        int n = 9876 , sum = 0 , rem;
        System.out.println("Number : "+ n);

        while (n > 0)
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        System.out.println("Sum : "+ sum);
    }
}
