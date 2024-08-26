public class Q1A {

    // 1. Write a program to calculate the sum of the first 50 natural numbers.
    public static  void main(String args[])
    {
        int sum = 0;
        for (int i = 1; i <= 50; i++)
        {
            sum = sum + i;
        }

        System.out.print("Sum : " + sum);
    }
}
